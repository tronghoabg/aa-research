package defpackage;

import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.TabTemplate;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;

/* loaded from: classes2.dex */
public final class gyv implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gyv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v51, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wb wbVar = (wb) obj;
                if (wbVar != null) {
                    return this.a.invoke((AlphaJumpTemplate) wbVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate");
            case 1:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 2:
                wb wbVar2 = (wb) obj;
                if (wbVar2 != null) {
                    return this.a.invoke((ListTemplate) wbVar2);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.ListTemplate");
            case 3:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 4:
                wb wbVar3 = (wb) obj;
                if (wbVar3 != null) {
                    return this.a.invoke((GridTemplate) wbVar3);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.GridTemplate");
            case 5:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 6:
                wb wbVar4 = (wb) obj;
                if (wbVar4 != null) {
                    return this.a.invoke((SectionedItemTemplate) wbVar4);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.SectionedItemTemplate");
            case 7:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 8:
                wb wbVar5 = (wb) obj;
                if (wbVar5 != null) {
                    return this.a.invoke((PaneTemplate) wbVar5);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.PaneTemplate");
            case 9:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 10:
                wb wbVar6 = (wb) obj;
                if (wbVar6 != null) {
                    return this.a.invoke((TabTemplate) wbVar6);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.TabTemplate");
            case 11:
                wb wbVar7 = (wb) obj;
                if (wbVar7 != null) {
                    return this.a.invoke((TabTemplateInternal) wbVar7);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.internal.model.TabTemplateInternal");
            case 12:
                wb wbVar8 = (wb) obj;
                if (wbVar8 != null) {
                    return this.a.invoke((GoogleTabTemplate) wbVar8);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.GoogleTabTemplate");
            case 13:
                this.a.get(((Number) obj).intValue());
                return null;
            case 14:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 15:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                if (cisVar.a()) {
                    this.a.b(true);
                }
                return afak.a;
            case 16:
                cis cisVar2 = (cis) obj;
                cisVar2.getClass();
                if (cisVar2.a()) {
                    this.a.b(true);
                }
                return afak.a;
            case 17:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 18:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 19:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                return Boolean.valueOf(gizVar.ordinal() != 1 ? false : ((cil) this.a).a(7));
            default:
                cho choVar = (cho) obj;
                choVar.getClass();
                int i = choVar.a;
                if (a.Y(i, 1)) {
                    choVar.a();
                }
                if (this.a == null && a.Y(i, 2)) {
                    choVar.a();
                }
                return afak.a;
        }
    }
}
