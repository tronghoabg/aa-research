package com.waze.settings;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gf extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37302a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37303b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f37304c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f37305d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f37306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gf(ds dsVar, View view, gr grVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37306e = i2;
        this.f37303b = dsVar;
        this.f37304c = view;
        this.f37305d = grVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f37306e;
        if (i2 == 0) {
            Object obj2 = this.f37303b;
            return new gf((ds) obj2, (View) this.f37304c, (gr) this.f37305d, eVar, 0);
        }
        Object obj3 = this.f37304c;
        if (i2 != 1) {
            return new gf((ds) obj3, (gk) this.f37303b, (gr) this.f37305d, eVar, 2);
        }
        return new gf((ds) obj3, (WazeSettingsView) this.f37305d, (gr) this.f37303b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f37306e;
        return i2 != 0 ? i2 != 1 ? ((gf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((gf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((gf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f37306e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f37302a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f37303b;
                Object obj3 = this.f37304c;
                Object obj4 = this.f37305d;
                View view = (View) obj3;
                this.f37302a = 1;
                if (((ds) obj2).A().collect(new ge(view, (gr) obj4, 0), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f37302a == 0) {
                e.b.c.b(obj);
                Object obj5 = this.f37304c;
                Object obj6 = this.f37305d;
                Object obj7 = this.f37303b;
                this.f37302a = 1;
                if (((ds) obj5).A().collect(new ge((ConstraintLayout) obj6, obj7, 1), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f37302a == 0) {
            e.b.c.b(obj);
            Object obj8 = this.f37304c;
            Object obj9 = this.f37303b;
            Object obj10 = this.f37305d;
            ds dsVar = (ds) obj8;
            gk gkVar = (gk) obj9;
            this.f37302a = 1;
            if (dsVar.A().collect(new gj(gkVar, (gr) obj10, dsVar), this) == aVar3) {
                return aVar3;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gf(ds dsVar, gk gkVar, gr grVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37306e = i2;
        this.f37304c = dsVar;
        this.f37303b = gkVar;
        this.f37305d = grVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gf(ds dsVar, WazeSettingsView wazeSettingsView, gr grVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37306e = i2;
        this.f37304c = dsVar;
        this.f37305d = wazeSettingsView;
        this.f37303b = grVar;
    }
}
