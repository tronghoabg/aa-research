package com.waze.settings;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class di extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37033a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37034b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f37035c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f37036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, Context context, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = context;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f37036d) {
            case 0:
                return new di((ds) this.f37034b, (Context) this.f37035c, eVar, 0);
            case 1:
                return new di((ds) this.f37035c, (q) this.f37034b, eVar, 1);
            case 2:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 2);
            case 3:
                return new di((ds) this.f37035c, (WazeSettingsView) this.f37034b, eVar, 3);
            case 4:
                return new di((ds) this.f37035c, (WazeSettingsView) this.f37034b, eVar, 4, (byte[]) null);
            case 5:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 5, (byte[]) null);
            case 6:
                return new di((ds) this.f37035c, (WazeSettingsView) this.f37034b, eVar, 6, (char[]) null);
            case 7:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 7, (char[]) null);
            case 8:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 8, (short[]) null);
            case 9:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 9, (int[]) null);
            case 10:
                return new di((ds) this.f37034b, (View) this.f37035c, eVar, 10, (boolean[]) null);
            case 11:
                return new di((ds) this.f37035c, (com.waze.sharedui.views.aj) this.f37034b, eVar, 11);
            default:
                return new di((gr) this.f37035c, (WazeSettingsView) this.f37034b, eVar, 12);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37036d) {
        }
        return ((di) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37036d) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f37033a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f37033a = 1;
                    obj = ((ds) this.f37034b).f37065d.a(com.waze.i.ah.IN_CAR_AAOS, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.f37034b;
                if (zBooleanValue) {
                    ds dsVar = (ds) obj2;
                    Toast.makeText((Context) this.f37035c, dsVar.f37066e.c(R.string.SETTING_SIGN_OUT_FROM_AAOS_SUCCESS, new Object[0]), 1).show();
                    dsVar.f().setConfigValueBool(ConfigValues.CONFIG_VALUE_LOGIN_SHOW_SIGN_OUT_FROM_AAOS_ENABLED, false);
                    dsVar.J();
                } else {
                    Toast.makeText((Context) this.f37035c, ((ds) obj2).f37066e.c(R.string.SETTING_SIGN_OUT_FROM_AAOS_ERROR, new Object[0]), 1).show();
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                try {
                    if (this.f37033a != 0) {
                        e.b.c.b(obj);
                        this = this;
                    } else {
                        e.b.c.b(obj);
                        com.waze.a.h hVar = com.waze.a.h.f13638a;
                        Object obj3 = this.f37035c;
                        this.f37033a = 1;
                        Object objA = hVar.a(((ds) obj3).f37066e, com.waze.network.f.ak.k((bs) ((ds) obj3).A().d()), ((ds) obj3).f37064c, true, this);
                        this = objA;
                        if (objA == aVar2) {
                            return aVar2;
                        }
                    }
                } catch (Exception unused) {
                    Object obj4 = this.f37034b;
                    com.waze.ab.o oVar = new com.waze.ab.o();
                    gr grVar = (gr) ((q) obj4).f37449a;
                    oVar.Q(grVar.f37336i.c(R.string.SOMETHING_WENT_WRONG, new Object[0]));
                    oVar.P(grVar.f37336i.c(R.string.PLEASE_TRY_AGAIN_LATER, new Object[0]));
                    oVar.y(true);
                    oVar.M(grVar.f37336i.c(R.string.OK, new Object[0]));
                    com.waze.z.a.d.ai.q(oVar);
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj5 = this.f37034b;
                    Object obj6 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj5).A().collect(new t(obj6, 6), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj7 = this.f37035c;
                    Object obj8 = this.f37034b;
                    this.f37033a = 1;
                    if (((ds) obj7).A().collect(new t(obj8, 7), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f37033a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f37033a = 1;
                    if (kotlinx.coroutines.b.ai.y(new dl(((ds) this.f37035c).A(), 9)).collect(new t(this.f37034b, 8), this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj9 = this.f37034b;
                    Object obj10 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj9).A().collect(new t(obj10, 9), this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj11 = this.f37035c;
                    Object obj12 = this.f37034b;
                    this.f37033a = 1;
                    if (((ds) obj11).A().collect(new t(obj12, 10), this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj13 = this.f37034b;
                    Object obj14 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj13).A().collect(new t(obj14, 11), this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj15 = this.f37034b;
                    Object obj16 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj15).A().collect(new t(obj16, 12), this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj17 = this.f37034b;
                    Object obj18 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj17).A().collect(new t(obj18, 13), this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj19 = this.f37034b;
                    Object obj20 = this.f37035c;
                    this.f37033a = 1;
                    if (((ds) obj19).A().collect(new t(obj20, 14), this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f37033a == 0) {
                    e.b.c.b(obj);
                    Object obj21 = this.f37035c;
                    Object obj22 = this.f37034b;
                    this.f37033a = 1;
                    if (((ds) obj21).A().collect(new ge((ConstraintLayout) obj22, obj21, 2), this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            default:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f37033a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f37033a = 1;
                    if (kotlinx.coroutines.b.ai.y(new dl(((gr) this.f37035c).d().A(), 12)).collect(new t(this.f37034b, 15), this) == aVar13) {
                        return aVar13;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, View view, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37034b = dsVar;
        this.f37035c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, q qVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = dsVar;
        this.f37034b = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, WazeSettingsView wazeSettingsView, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = dsVar;
        this.f37034b = wazeSettingsView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, WazeSettingsView wazeSettingsView, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = dsVar;
        this.f37034b = wazeSettingsView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, WazeSettingsView wazeSettingsView, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = dsVar;
        this.f37034b = wazeSettingsView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(ds dsVar, com.waze.sharedui.views.aj ajVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = dsVar;
        this.f37034b = ajVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(gr grVar, WazeSettingsView wazeSettingsView, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37036d = i2;
        this.f37035c = grVar;
        this.f37034b = wazeSettingsView;
    }
}
