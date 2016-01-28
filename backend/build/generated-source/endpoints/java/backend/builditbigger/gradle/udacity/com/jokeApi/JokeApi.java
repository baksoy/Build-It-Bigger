/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-01-28 at 21:00:34 UTC 
 * Modify at your own risk.
 */

package backend.builditbigger.gradle.udacity.com.jokeApi;

/**
 * Service definition for JokeApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JokeApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class JokeApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the jokeApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://demogradle-2016.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "jokeApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public JokeApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  JokeApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getJoke".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link GetJoke#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetJoke getJoke() throws java.io.IOException {
    GetJoke result = new GetJoke();
    initialize(result);
    return result;
  }

  public class GetJoke extends JokeApiRequest<backend.builditbigger.gradle.udacity.com.jokeApi.model.JokeBean> {

    private static final String REST_PATH = "jokebean";

    /**
     * Create a request for the method "getJoke".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link GetJoke#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetJoke#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetJoke() {
      super(JokeApi.this, "GET", REST_PATH, null, backend.builditbigger.gradle.udacity.com.jokeApi.model.JokeBean.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetJoke setAlt(java.lang.String alt) {
      return (GetJoke) super.setAlt(alt);
    }

    @Override
    public GetJoke setFields(java.lang.String fields) {
      return (GetJoke) super.setFields(fields);
    }

    @Override
    public GetJoke setKey(java.lang.String key) {
      return (GetJoke) super.setKey(key);
    }

    @Override
    public GetJoke setOauthToken(java.lang.String oauthToken) {
      return (GetJoke) super.setOauthToken(oauthToken);
    }

    @Override
    public GetJoke setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetJoke) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetJoke setQuotaUser(java.lang.String quotaUser) {
      return (GetJoke) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetJoke setUserIp(java.lang.String userIp) {
      return (GetJoke) super.setUserIp(userIp);
    }

    @Override
    public GetJoke set(String parameterName, Object value) {
      return (GetJoke) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "setJoke".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link SetJoke#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public SetJoke setJoke() throws java.io.IOException {
    SetJoke result = new SetJoke();
    initialize(result);
    return result;
  }

  public class SetJoke extends JokeApiRequest<backend.builditbigger.gradle.udacity.com.jokeApi.model.JokeBean> {

    private static final String REST_PATH = "setJoke";

    /**
     * Create a request for the method "setJoke".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link SetJoke#execute()} method to invoke the remote operation. <p>
     * {@link
     * SetJoke#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected SetJoke() {
      super(JokeApi.this, "POST", REST_PATH, null, backend.builditbigger.gradle.udacity.com.jokeApi.model.JokeBean.class);
    }

    @Override
    public SetJoke setAlt(java.lang.String alt) {
      return (SetJoke) super.setAlt(alt);
    }

    @Override
    public SetJoke setFields(java.lang.String fields) {
      return (SetJoke) super.setFields(fields);
    }

    @Override
    public SetJoke setKey(java.lang.String key) {
      return (SetJoke) super.setKey(key);
    }

    @Override
    public SetJoke setOauthToken(java.lang.String oauthToken) {
      return (SetJoke) super.setOauthToken(oauthToken);
    }

    @Override
    public SetJoke setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SetJoke) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SetJoke setQuotaUser(java.lang.String quotaUser) {
      return (SetJoke) super.setQuotaUser(quotaUser);
    }

    @Override
    public SetJoke setUserIp(java.lang.String userIp) {
      return (SetJoke) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String joke;

    /**

     */
    public java.lang.String getJoke() {
      return joke;
    }

    public SetJoke setJoke(java.lang.String joke) {
      this.joke = joke;
      return this;
    }

    @Override
    public SetJoke set(String parameterName, Object value) {
      return (SetJoke) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link JokeApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link JokeApi}. */
    @Override
    public JokeApi build() {
      return new JokeApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link JokeApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setJokeApiRequestInitializer(
        JokeApiRequestInitializer jokeapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(jokeapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
