package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

@Deprecated
/* loaded from: classes2.dex */
public class ajww extends ajzw implements ajrt {
    public final ajph a;
    public URI b;
    public int c;
    private String f;
    private ajpt g;

    public ajww(ajph ajphVar) throws ajps {
        ahgm.e(ajphVar, "HTTP request");
        this.a = ajphVar;
        j(ajphVar.hX());
        i(ajphVar.l());
        if (ajphVar instanceof ajrt) {
            ajrt ajrtVar = (ajrt) ajphVar;
            this.b = ajrtVar.t();
            this.f = ajrtVar.s();
            this.g = null;
        } else {
            akah akahVarP = ajphVar.p();
            try {
                this.b = new URI(akahVarP.c);
                this.f = akahVarP.b;
                this.g = ajphVar.d();
            } catch (URISyntaxException e) {
                throw new ajps("Invalid request URI: ".concat(akahVarP.c), e);
            }
        }
        this.c = 0;
    }

    @Override // defpackage.ajpg
    public final ajpt d() {
        ajpt ajptVar = this.g;
        if (ajptVar != null) {
            return ajptVar;
        }
        ajpt ajptVarB = akat.b(hX());
        this.g = ajptVarB;
        return ajptVarB;
    }

    @Override // defpackage.ajph
    public final akah p() {
        ajpt ajptVarD = d();
        URI uri = this.b;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new akah(this.f, aSCIIString, ajptVarD);
    }

    public boolean q() {
        return true;
    }

    @Override // defpackage.ajrt
    public final boolean r() {
        return false;
    }

    @Override // defpackage.ajrt
    public final String s() {
        return this.f;
    }

    @Override // defpackage.ajrt
    public final URI t() {
        return this.b;
    }
}
