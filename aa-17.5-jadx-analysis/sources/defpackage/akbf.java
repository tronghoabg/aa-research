package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class akbf implements ajpi {
    private final /* synthetic */ int a;

    public akbf(int i) {
        this.a = i;
    }

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        int i = this.a;
        if (i == 0) {
            if (ajphVar instanceof ajpc) {
                if (ajphVar.k("Transfer-Encoding")) {
                    throw new ajps("Transfer-encoding header already present");
                }
                if (ajphVar.k("Content-Length")) {
                    throw new ajps("Content-Length header already present");
                }
                ajpt ajptVar = ajphVar.p().a;
                ajpb ajpbVarA = ((ajpc) ajphVar).a();
                if (ajpbVarA == null) {
                    ajphVar.g("Content-Length", CloudRecognizerProtocolStrings.DBG_VALUE);
                    return;
                }
                if (!ajpbVarA.g() && ajpbVarA.a() >= 0) {
                    ajphVar.g("Content-Length", Long.toString(ajpbVarA.a()));
                } else {
                    if (ajptVar.a(ajpm.b)) {
                        throw new ajps("Chunked transfer encoding not allowed for ".concat(ajptVar.toString()));
                    }
                    ajphVar.g("Transfer-Encoding", "chunked");
                }
                if (ajpbVarA.d() != null && !ajphVar.k("Content-Type")) {
                    ajphVar.f(ajpbVarA.d());
                }
                if (ajpbVarA.c() == null || ajphVar.k("Content-Encoding")) {
                    return;
                }
                ajphVar.f(ajpbVarA.c());
                return;
            }
            return;
        }
        if (i == 1) {
            if (ajphVar.p().b.equalsIgnoreCase("CONNECT")) {
                return;
            }
            Collection collection = (Collection) ajphVar.hX().a("http.default-headers");
            Collection collection2 = collection != null ? collection : null;
            if (collection2 != null) {
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    ajphVar.f((ajoy) it.next());
                }
                return;
            }
            return;
        }
        if (i == 2) {
            if (ajphVar.k("Expect") || !(ajphVar instanceof ajpc)) {
                return;
            }
            ajpt ajptVar2 = ajphVar.p().a;
            ajpb ajpbVarA2 = ((ajpc) ajphVar).a();
            if (ajpbVarA2 == null || ajpbVarA2.a() == 0 || ajptVar2.a(ajpm.b) || !ajphVar.hX().d("http.protocol.expect-continue", false)) {
                return;
            }
            ajphVar.g("Expect", "100-continue");
            return;
        }
        if (i != 3) {
            if (ajphVar.k("User-Agent")) {
                return;
            }
            akas akasVarHX = ajphVar.hX();
            String str = akasVarHX != null ? (String) akasVarHX.a("http.useragent") : null;
            String str2 = str != null ? str : null;
            if (str2 != null) {
                ajphVar.g("User-Agent", str2);
                return;
            }
            return;
        }
        ahgm.e(akbaVar, "HTTP context");
        akbb akbbVar = akbaVar instanceof akbb ? (akbb) akbaVar : new akbb(akbaVar);
        ajpt ajptVar3 = ajphVar.p().a;
        if ((ajphVar.p().b.equalsIgnoreCase("CONNECT") && ajptVar3.a(ajpm.b)) || ajphVar.k("Host")) {
            return;
        }
        ajpe ajpeVarL = akbbVar.l();
        if (ajpeVarL == null) {
            ajpa ajpaVarK = akbbVar.k();
            if (ajpaVarK instanceof ajpf) {
                ajpf ajpfVar = (ajpf) ajpaVarK;
                InetAddress inetAddressL = ajpfVar.l();
                int iK = ajpfVar.k();
                if (inetAddressL != null) {
                    ajpeVarL = new ajpe(inetAddressL.getHostName(), iK, null);
                }
            }
            if (ajpeVarL == null) {
                if (!ajptVar3.a(ajpm.b)) {
                    throw new ajps("Target host missing");
                }
                return;
            }
        }
        ajphVar.g("Host", ajpeVarL.a());
    }
}
