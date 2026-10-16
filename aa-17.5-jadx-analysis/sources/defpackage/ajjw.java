package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajjw implements ajhy {
    private final ajhp a;

    public ajjw(ajhp ajhpVar) {
        this.a = ajhpVar;
    }

    @Override // defpackage.ajhy
    public final ajif a(ajke ajkeVar) throws IOException {
        ajid ajidVar = ajkeVar.b;
        ajic ajicVar = new ajic(ajidVar);
        boolean z = false;
        if (ajidVar.a("Host") == null) {
            ajicVar.b("Host", ajis.c(ajidVar.a, false));
        }
        if (ajidVar.a("Connection") == null) {
            ajicVar.b("Connection", "Keep-Alive");
        }
        if (ajidVar.a("Accept-Encoding") == null && ajidVar.a("Range") == null) {
            ajicVar.b("Accept-Encoding", "gzip");
            z = true;
        }
        ajhp ajhpVar = this.a;
        if (ajidVar.a("User-Agent") == null) {
            ajicVar.b("User-Agent", "okhttp/5.3.2");
        }
        ajid ajidVar2 = new ajid(ajicVar);
        ajif ajifVarA = ajkeVar.a(ajidVar2);
        ajhx ajhxVar = ajidVar2.a;
        ajhv ajhvVar = ajifVarA.f;
        ajkd.a(ajhpVar, ajhxVar, ajhvVar);
        ajie ajieVar = new ajie(ajifVarA);
        ajieVar.c(ajidVar2);
        if (z && afyh.R("gzip", ajifVarA.a("Content-Encoding")) && ajkd.b(ajifVarA)) {
            ajnk ajnkVar = new ajnk(ajifVarA.g.c());
            erb erbVarJ = ahdw.j(ajhvVar);
            ahdw.m(erbVarJ, "Content-Encoding");
            ahdw.m(erbVarJ, "Content-Length");
            ajieVar.b(ahdw.k(erbVarJ));
            ajieVar.e = new ajkf(ajifVarA.a("Content-Type"), -1L, ahfm.b(ajnkVar));
        }
        return ajieVar.a();
    }
}
