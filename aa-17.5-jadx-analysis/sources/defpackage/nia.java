package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class nia implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nia(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return nih.i(this.a, (cis) obj);
            case 1:
                cie cieVar = (cie) obj;
                yph yphVar = nih.a;
                cieVar.getClass();
                cieVar.e((cil) this.a);
                return afak.a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r3 = this.a;
                yph yphVar2 = nih.a;
                r3.b(Boolean.valueOf(zBooleanValue));
                return afak.a;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ?? r32 = this.a;
                yph yphVar3 = nih.a;
                r32.b(Boolean.valueOf(zBooleanValue2));
                return afak.a;
            case 4:
                cie cieVar2 = (cie) obj;
                ?? r33 = this.a;
                yph yphVar4 = nih.a;
                cieVar2.getClass();
                cieVar2.a(!((Boolean) r33.a()).booleanValue());
                return afak.a;
            case 5:
                return nih.i(this.a, (cis) obj);
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ?? r34 = this.a;
                yph yphVar5 = nih.a;
                r34.b(Boolean.valueOf(zBooleanValue3));
                return afak.a;
            case 7:
                return nih.h(this.a, (cis) obj);
            case 8:
                ?? r35 = this.a;
                yph yphVar6 = nih.a;
                ((ery) obj).getClass();
                if (((Boolean) r35.a()).booleanValue()) {
                    nfy.a().c(ngb.k);
                }
                return new nif();
            default:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = this.a;
                    nfy nfyVarA = nfy.a();
                    nfyVarA.b(((Fragment) obj2).getViewLifecycleOwner(), new niu(obj2, 2));
                    nfyVarA.c(ngb.k);
                }
                return afak.a;
        }
    }
}
