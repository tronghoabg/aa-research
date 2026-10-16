package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.geo.mapcore.renderer.LayeredLabelRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uvc extends utj implements utb {
    static final ute a = new ute(0, 0, 0, 1);
    private final utf b;
    private final ArrayList c;
    private uue d;
    private uue e;
    private LayeredLabelRenderer.LayeredLabelShaderProgram f;

    public uvc(utf utfVar) {
        super(utfVar.c(), a);
        this.c = new ArrayList();
        this.f = null;
        this.b = utfVar;
        uue uueVar = uue.a;
        this.d = uueVar;
        this.e = uueVar;
    }

    @Override // defpackage.utj, defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
        uue uueVar = this.d;
        uue uueVar2 = uue.a;
        if (uueVar == uueVar2 || this.e == uueVar2) {
            return;
        }
        LayeredLabelRenderer.LayeredLabelShaderProgram layeredLabelShaderProgram = this.f;
        layeredLabelShaderProgram.getClass();
        uud uudVar = this.l;
        uudVar.getClass();
        int i = 0;
        if (!(uthVar instanceof uvc)) {
            layeredLabelShaderProgram.getClass();
            uudVar.getClass();
            uudVar.n(1, 771);
            uudVar.s(false, 0, 0, 0);
            uudVar.p(519);
            uudVar.q(0);
            uudVar.f(this.f.w);
            GLES20.glUniform1i(this.f.a, 0);
            GLES20.glUniform2f(this.f.c, usyVar.k(), usyVar.j());
            uudVar.g(this.d);
            uudVar.e(this.e);
            uudVar.k(0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 132, 0);
            uudVar.k(1);
            GLES20.glVertexAttribPointer(1, 1, 5126, false, 132, 8);
            int i2 = 2;
            for (int i3 = 0; i3 < 6; i3++) {
                uudVar.k(i2);
                int i4 = i3 * 20;
                GLES20.glVertexAttribPointer(i2, 4, 5126, false, 132, i4 + 12);
                int i5 = i2 + 1;
                uudVar.k(i5);
                GLES20.glVertexAttribPointer(i5, 1, 5126, false, 132, i4 + 28);
                i2 += 2;
            }
            int i6 = uuc.a().f;
            while (i2 < i6) {
                uudVar.j(i2);
                i2++;
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
                    GLES20.glUniform2f(this.f.b, 1.0f / iD, 1.0f / iC);
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
        this.d = uueVar;
        this.e = uueVar2;
        this.f = (LayeredLabelRenderer.LayeredLabelShaderProgram) uvwVar;
    }

    @Override // defpackage.utb
    public final void s() {
        uue uueVar = uue.a;
        this.d = uueVar;
        this.e = uueVar;
    }
}
