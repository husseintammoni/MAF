Feature: GitHub Jobs API Cases

  Scenario Outline: Retrieve all Jobs using query parameters contain <scenarioName>
    When Send the API call GET https://jobs.github.com/positions.json with query parameters
    """
    <url>
    """
    Then I should received response with status code 200.

    Examples:
      | scenarioName                                             | url                                                                                      |
      | Valid Description                                        | ?description=QA                                                                          |
      | Empty Description                                        | ?description=                                                                            |
      | Valid Description                                        | ?description=ruby                                                                        |
      | Valid Description                                        | ?description=java                                                                        |
      | Valid location                                           | ?location=San Francisco                                                                  |
      | Valid location and Lat/Long                              | ?location=San Francisco&lat=37.3229978&long=-122.0321823                                 |
      | Valid location and Full Time                             | ?location=San Francisco&full_time=true                                                   |
      | Valid location have Zip code                             | ?location=10106                                                                          |
      | Valid Description and location                           | ?location=San Francisco&description=ruby                                                 |
      | Valid Lat and Long                                       | ?lat=37.3229978&long=-122.0321823                                                        |
      | Valid Description, location and Lat/Long                 | ?location=San Francisco&description=ruby&lat=37.3229978&long=-122.0321823                |
      | Full Time                                                | ?full_time=true                                                                          |
      | Full Time and Lat/Long                                   | ?full_time=true&lat=37.3229978&long=-122.0321823                                         |
      | Valid Description, location, Lat/Long and Full Time True | ?location=San Francisco&description=ruby&lat=37.3229978&long=-122.0321823&full_time=true |
      | Valid Description, Lat/Long and Full Time True           | ?description=ruby&lat=37.3229978&long=-122.0321823&full_time=true                        |
      | Valid Description, location and Full Time True           | ?location=San Francisco&description=ruby&full_time=true                                  |
      | Description and Lat/Long                                 | ?description=QA&long=10&lat=10                                                           |
      | Description and Full Time True                           | ?description=QA&full_time=true                                                           |

  Scenario Outline: Retrieve all Jobs using query parameters contain <scenarioName> To verify the Jobs number Per page
    When Send the API call GET https://jobs.github.com/positions.json with query parameters
    """
    <url>
    """
    Then Should received number of Jobs 50 per page.

    Examples:
      | scenarioName      | url               |
      | Valid Description | ?page=0 |
