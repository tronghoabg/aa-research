package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uva extends utj implements utb {
    static final ute a = new ute(0, 0, 0, 0);
    private final utf b;
    private final ArrayList c;
    private uue d;
    private uue e;
    private int f;
    private int g;
    private int h;
    private int y;

    public uva(utf utfVar) {
        super(utfVar.c(), a);
        this.c = new ArrayList();
        this.b = utfVar;
        uue uueVar = uue.a;
        this.d = uueVar;
        this.e = uueVar;
    }

    @Override // defpackage.utj, defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
        uud uudVar = this.l;
        uudVar.getClass();
        uue uueVar = this.d;
        uue uueVar2 = uue.a;
        if (uueVar == uueVar2 || this.e == uueVar2) {
            return;
        }
        int i = 0;
        if (!(uthVar instanceof uva)) {
            uudVar.n(1, 771);
            uudVar.s(false, 0, 0, 0);
            uudVar.p(519);
            uudVar.q(0);
            uudVar.f(this.f);
            GLES20.glUniform1i(this.g, 0);
            GLES20.glUniform2f(this.y, usyVar.k(), usyVar.j());
            uudVar.g(this.d);
            uudVar.e(this.e);
            uudVar.k(0);
            GLES20.glVertexAttribPointer(0, 3, 5126, false, 20, 0);
            uudVar.k(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 20, 12);
            int i2 = uuc.a().f;
            for (int i3 = 2; i3 < i2; i3++) {
                uudVar.j(i3);
            }
        }
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            adut adutVar = (adut) arrayList.get(i);
            Object obj = adutVar.c;
            if (obj != null) {
                uue uueVarE = ((uwg) obj).e();
                int iD = ((uwg) adutVar.c).d();
                int iC = ((uwg) adutVar.c).c();
                if (uueVarE != null && uueVarE.b()) {
                    uudVar.x(1, uueVarE);
                    GLES20.glUniform2f(this.h, 1.0f / iD, 1.0f / iC);
                    GLES20.glDrawElements(4, adutVar.a, 5123, adutVar.b);
                }
            }
            i++;
        }
    }

    @Override // defpackage.utj, defpackage.uth
    public final utf j() {
        return this.b;
    }

    @Override // defpackage.utj, defpackage.uth
    public final boolean o() {
        return true;
    }

    @Override // defpackage.utb
    public final List q() {
        return this.c;
    }

    @Override // defpackage.utb
    public final /* bridge */ /* synthetic */ void r(uue uueVar, uue uueVar2, uvw uvwVar) {
        LabelRenderer.LabelShaderProgram labelShaderProgram = (LabelRenderer.LabelShaderProgram) uvwVar;
        this.d = uueVar;
        this.e = uueVar2;
        this.f = labelShaderProgram.w;
        this.g = labelShaderProgram.a;
        this.h = labelShaderProgram.b;
        this.y = labelShaderProgram.c;
    }

    @Override // defpackage.utb
    public final void s() {
        uue uueVar = uue.a;
        this.d = uueVar;
        this.e = uueVar;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.y = 0;
    }
}
