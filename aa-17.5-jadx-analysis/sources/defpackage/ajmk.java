package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes2.dex */
public final class ajmk extends ajmi {
    public static final ajnr f;
    public final ajnr g;
    private final ajnf h;

    static {
        String str = ajnr.a;
        f = ahfo.a("okhttp3/internal/publicsuffix/" + PublicSuffixDatabase.class.getSimpleName() + ".list");
    }

    public ajmk(ajnr ajnrVar, ajnf ajnfVar) {
        ajnrVar.getClass();
        ajnfVar.getClass();
        this.g = ajnrVar;
        this.h = ajnfVar;
    }

    @Override // defpackage.ajmi
    public final ajoc b() throws IOException {
        ajnr ajnrVar = this.g;
        if (!ahfy.c(ajnrVar)) {
            Objects.toString(ajnrVar);
            throw new FileNotFoundException("file not found: ".concat(ajnrVar.toString()));
        }
        ajnf ajnfVar = this.h;
        ajnr ajnrVar2 = ajon.c;
        URL resource = ((ajon) ajnfVar).d.getResource(ajoi.e(ajnrVar2, ajnrVar, false).g(ajnrVar2).toString());
        if (resource == null) {
            Objects.toString(ajnrVar);
            throw new FileNotFoundException("file not found: ".concat(ajnrVar.toString()));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return ahfm.e(inputStream);
    }
}
