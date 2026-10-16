package defpackage;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class msy implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ msy(float f, bym bymVar, int i) {
        this.c = i;
        this.a = f;
        this.b = bymVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.c;
        float fMin = 1.0f;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (i == 0) {
            cks cksVar = (cks) obj;
            cksVar.getClass();
            ?? r0 = this.b;
            if (!affa.e(lxw.o(r0), BitmapDescriptorFactory.HUE_RED)) {
                afgw afgwVar = new afgw(this.a, 1.0f);
                Float fO = lxw.o(r0);
                fO.getClass();
                fMin = Math.min(((Number) afgwVar.d()).floatValue() + ((((Number) afgwVar.c()).floatValue() - ((Number) afgwVar.d()).floatValue()) * Math.abs(fO.floatValue())), ((Number) afgwVar.c()).floatValue());
            }
            cksVar.z(fMin);
            cksVar.A(fMin);
            return afak.a;
        }
        if (i == 1) {
            giz gizVar = (giz) obj;
            gizVar.getClass();
            int iOrdinal = gizVar.ordinal();
            float f = this.a;
            Object obj2 = this.b;
            if (iOrdinal == 0) {
                ((hga) obj2).a.invoke(fValueOf, Float.valueOf(-f));
            } else if (iOrdinal == 1) {
                ((hga) obj2).a.invoke(fValueOf, Float.valueOf(f));
            } else if (iOrdinal == 2) {
                ((hga) obj2).a.invoke(Float.valueOf(-f), fValueOf);
            } else {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                ((hga) obj2).a.invoke(Float.valueOf(f), fValueOf);
            }
            return true;
        }
        if (i == 2) {
            abh abhVar = (abh) obj;
            abhVar.getClass();
            boolean zF = affa.f(((aezu) abhVar.f()).a, ((aezu) abhVar.g()).a);
            if (!((Boolean) this.b.a()).booleanValue() && !zF) {
                Object obj3 = ((aezu) abhVar.g()).a;
                msl mslVar = msl.a;
                if (!affa.f(obj3, mslVar) && !affa.f(((aezu) abhVar.f()).a, mslVar)) {
                    float f2 = this.a;
                    if (!affa.f(((aezu) abhVar.g()).a, ((aezu) abhVar.f()).b)) {
                        return affa.f(((aezu) abhVar.g()).b, ((aezu) abhVar.f()).a) ? new aby(ca.T(abhVar), acl.r(null, f2, 0L, 5).a(acl.C(null, 3)), BitmapDescriptorFactory.HUE_RED, 12) : new aby(ca.T(abhVar), acl.C(null, 3), BitmapDescriptorFactory.HUE_RED, 12);
                    }
                    acp acpVarA = acl.q(null, f2, 0L, 5).a(acl.B(null, 3));
                    Map map = ahc.a;
                    return new aby(acpVarA, abhVar.b(new aft(1.0f, 1500.0f, new dlo(4294967297L)), new abc(5)), -1.0f, 8);
                }
            }
            return new aby(acp.a, acq.a, BitmapDescriptorFactory.HUE_RED, 12);
        }
        if (i != 3) {
            oog oogVar = (oog) obj;
            oogVar.getClass();
            float f3 = this.a;
            oogVar.a(f3, f3);
            return afak.a;
        }
        Context context = (Context) obj;
        context.getClass();
        opn opnVar = opr.a.a().f;
        opi opiVar = (opi) this.b;
        AppWidgetHostView appWidgetHostViewCreateView = opnVar.createView(context, opiVar.a, opiVar.b);
        appWidgetHostViewCreateView.getClass();
        oog oogVar2 = (oog) appWidgetHostViewCreateView;
        float f4 = this.a;
        oogVar2.a(f4, f4);
        return oogVar2;
    }

    public /* synthetic */ msy(Object obj, float f, int i) {
        this.c = i;
        this.b = obj;
        this.a = f;
    }
}
