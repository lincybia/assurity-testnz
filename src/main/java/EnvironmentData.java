public enum EnvironmentData {
    BASEURI("https://api.tmsandbox.co.nz"),
    BASEPATH("/v1/Categories");
    private final String value;

    EnvironmentData(String value) {

        this.value = value;
    }

    public String getEnvironmentData() {

        return this.value;
    }
}
