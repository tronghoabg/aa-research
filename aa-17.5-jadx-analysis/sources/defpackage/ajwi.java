package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Deprecated
/* loaded from: classes2.dex */
public class ajwi extends ajvy {
    public ajwi() {
        super(null, null);
    }

    public static void setDefaultHttpParams(akas akasVar) throws IOException {
        Properties properties;
        InputStream resourceAsStream;
        ajpm ajpmVar = ajpm.c;
        ahgm.e(akasVar, "HTTP parameters");
        akasVar.b("http.protocol.version", ajpmVar);
        String strName = akaz.a.name();
        ahgm.e(akasVar, "HTTP parameters");
        akasVar.b("http.protocol.content-charset", strName);
        ahgm.e(akasVar, "HTTP parameters");
        akasVar.h();
        ahgm.e(akasVar, "HTTP parameters");
        akasVar.i("http.socket.buffer-size", 8192);
        ClassLoader classLoader = ajwi.class.getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        akbi akbiVar = null;
        try {
            resourceAsStream = classLoader.getResourceAsStream(a.bK("org/apache/http/client", "/version.properties"));
        } catch (IOException unused) {
        }
        if (resourceAsStream != null) {
            try {
                properties = new Properties();
                properties.load(resourceAsStream);
            } finally {
                resourceAsStream.close();
            }
        } else {
            properties = null;
        }
        if (properties != null) {
            String str = (String) properties.get("info.module");
            if (str != null && str.length() <= 0) {
                str = null;
            }
            String str2 = (String) properties.get("info.release");
            if (str2 != null && (str2.length() <= 0 || str2.equals("${pom.version}"))) {
                str2 = null;
            }
            String str3 = (String) properties.get("info.timestamp");
            if (str3 != null && (str3.length() <= 0 || str3.equals("${mvn.timestamp}"))) {
                str3 = null;
            }
            akbiVar = new akbi(str, str2, str3, classLoader != null ? classLoader.toString() : null);
        }
        String str4 = String.format("%s/%s (Java)", "Apache-HttpClient", akbiVar != null ? akbiVar.a : "UNAVAILABLE");
        ahgm.e(akasVar, "HTTP parameters");
        akasVar.b("http.useragent", str4);
    }

    @Override // defpackage.ajvy
    protected akas createHttpParams() throws IOException {
        akau akauVar = new akau();
        setDefaultHttpParams(akauVar);
        return akauVar;
    }

    @Override // defpackage.ajvy
    protected akax createHttpProcessor() {
        akax akaxVar = new akax();
        akaxVar.g(new akbf(1));
        akaxVar.g(new akbf(0));
        akaxVar.g(new akbf(3));
        akaxVar.g(new ajsa());
        akaxVar.g(new akbf(4));
        akaxVar.g(new akbf(2));
        akaxVar.g(new ajrx());
        akaxVar.h(new ajsd());
        akaxVar.g(new ajry());
        akaxVar.g(new ajsc());
        akaxVar.g(new ajsb());
        return akaxVar;
    }

    public ajwi(ajso ajsoVar) {
        super(ajsoVar, null);
    }

    public ajwi(ajso ajsoVar, akas akasVar) {
        super(ajsoVar, akasVar);
    }

    public ajwi(akas akasVar) {
        super(null, akasVar);
    }
}
