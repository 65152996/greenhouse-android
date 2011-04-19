/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.greenhouse;


/**
 * <p>
 * This is the central class for interacting with Greenhouse.
 * </p>
 * 
 * <p>
 * Greenhouse operations require OAuth authentication with the server.
 * Therefore, GreenhouseTemplate must be constructed with the minimal
 * information required to sign requests with and OAuth 1 Authorization header.
 * </p>
 * 
 * @author Craig Walls
 */
public class GreenhouseTemplateOLD {//implements GreenhouseOperations {
//	RestOperations restOperations;
//	private String baseUrl;

	/**
	 * <p>
	 * Constructs a GreenhouseTemplate with the minimal amount of information
	 * required to sign requests with an OAuth 1 Authorization header.
	 * </p>
	 * 
	 * <p>
	 * This constructor assumes that the application will be conversing with the
	 * production Greenhouse server at http://springsource.greenhouse.org.
	 * </p>
	 * 
	 * @param apiKey
	 *            The application's API Key as assigned when registering the
	 *            application with Greenhouse
	 * @param apiSecret
	 *            The application's API Secret as assigned when registering the
	 *            application with Greenhouse
	 * @param accessToken
	 *            An access token acquired through successful OAuth 1
	 *            authentication with Greenhouse
	 * @param accessTokenSecret
	 *            An access token secret acquired through successful OAuth 1
	 *            authentication with Greenhouse
	 */
//	public GreenhouseTemplateOLD(String apiKey, String apiSecret, String accessToken, String accessTokenSecret) {
//        this(apiKey, apiSecret, accessToken, accessTokenSecret, DEFAULT_BASE_URL);
//    }

	/**
	 * <p>
	 * Constructs a GreenhouseTemplate with the minimal amount of information
	 * required to sign requests with an OAuth 1 Authorization header.
	 * </p>
	 * 
	 * <p>
	 * This constructor allows the application to specify the base URL of the
	 * Greenhouse server, enabling the template to converse with a development
	 * or test server.
	 * </p>
	 * 
	 * @param apiKey
	 *            The application's API Key as assigned when registering the
	 *            application with Greenhouse
	 * @param apiSecret
	 *            The application's API Secret as assigned when registering the
	 *            application with Greenhouse
	 * @param accessToken
	 *            An access token acquired through successful OAuth 1
	 *            authentication with Greenhouse
	 * @param accessTokenSecret
	 *            An access token secret acquired through successful OAuth 1
	 *            authentication with Greenhouse
	 * @param baseUrl
	 *            The base URL of the Greenhouse server
	 */
//	public GreenhouseTemplateOLD(String apiKey, String apiSecret, String accessToken, String accessTokenSecret, String baseUrl) {
//		RestTemplate restTemplate = new RestTemplate(new OAuthSigningClientHttpRequestFactory(
//				new HttpComponentsClientHttpRequestFactory(),
//				OAuth1RequestSignerFactory.getRequestSigner(apiKey, apiSecret, accessToken, accessTokenSecret)));
//		this.restOperations = restTemplate;
//		jsonAcceptingHeaders = new LinkedMultiValueMap<String, String>();
//		jsonAcceptingHeaders.add("Accept", "application/json");
//		this.baseUrl = baseUrl;
//	}
//	
//
//	public GreenhouseProfile getUserProfile() {
//		return restOperations.exchange(baseUrl + PROFILE_PATH, HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), GreenhouseProfile.class, "@self").getBody();
//	}
//
//	public List<Event> getUpcomingEvents() {
//		return Arrays.asList(restOperations.exchange(baseUrl + EVENTS_PATH, HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), Event[].class).getBody());
//	}
//
//	public List<Event> getEventsAfter(Date date) {
//		String isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000-00:00").format(date);
//		return Arrays.asList(restOperations.exchange(baseUrl + EVENTS_PATH + "?after={dateTime}", HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), Event[].class, isoDate).getBody());
//	}
//
//	public List<EventSession> getSessionsOnDay(long eventId, Date date) {
//		String isoDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
//		return Arrays.asList(restOperations.exchange(baseUrl + SESSIONS_FOR_DAY_PATH, HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), EventSession[].class, eventId, isoDate).getBody());
//	}
//	
//	public List<EventSession> getFavoriteSessions(long eventId) {
//		return Arrays.asList(restOperations.exchange(baseUrl + FAVORITE_SESSIONS_PATH, HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), EventSession[].class, eventId).getBody());
//	}
//	
//	public List<EventSession> getConferenceFavoriteSessions(long eventId) {
//		return Arrays.asList(restOperations.exchange(baseUrl + CONFERENCE_FAVORITE_SESSIONS_PATH, HttpMethod.GET,
//				new HttpEntity<Object>(jsonAcceptingHeaders), EventSession[].class, eventId).getBody());
//	}
//	
//	public boolean updateFavoriteSession(long eventId, long sessionId) {
//		return restOperations.exchange(baseUrl + UPDATE_FAVORITE_SESSION_PATH, HttpMethod.PUT,
//				new HttpEntity<Object>(jsonAcceptingHeaders), Boolean.class, eventId, sessionId).getBody();
//	}
//
//
//	static final String DEFAULT_BASE_URL = "https://greenhouse.springsource.org";
//	static final String PROFILE_PATH = "/members/{id}";
//	static final String EVENTS_PATH = "/events";
//	static final String SESSIONS_FOR_DAY_PATH = "/events/{eventId}/sessions/{day}";
//	static final String FAVORITE_SESSIONS_PATH = "/events/{eventId}/sessions/favorites";
//	static final String CONFERENCE_FAVORITE_SESSIONS_PATH = "/events/{eventId}/favorites";
//	static final String UPDATE_FAVORITE_SESSION_PATH = "/events/{eventId}/sessions/{sessionId}/favorite";
//	private MultiValueMap<String, String> jsonAcceptingHeaders;
}
