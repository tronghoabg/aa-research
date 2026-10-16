package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class ek extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2) {
        super(1, obj, el.class, "optionsSettingsClicked", "optionsSettingsClicked(Lcom/waze/settings/tree/nodes/SettingChoice;)V", 0);
        this.f21538a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f21538a;
        if (i2 == 0) {
            com.waze.settings.tree.d.d dVar = (com.waze.settings.tree.d.d) obj;
            h.g.b.x.f(dVar, "p0");
            el.l((el) this.receiver, dVar);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.g.a.l lVar = (h.g.a.l) obj;
            h.g.b.x.f(lVar, "p0");
            el.j((el) this.receiver, lVar);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            com.waze.settings.tree.d.n nVar = (com.waze.settings.tree.d.n) obj;
            h.g.b.x.f(nVar, "p0");
            el.m((el) this.receiver, nVar);
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            com.waze.car_lib.o.v vVar = (com.waze.car_lib.o.v) obj;
            h.g.b.x.f(vVar, "p0");
            el.b((el) this.receiver, vVar);
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            com.waze.settings.tree.d.h hVar = (com.waze.settings.tree.d.h) obj;
            h.g.b.x.f(hVar, "p0");
            ((el) this.receiver).f21540b.a(hVar);
            return h.ab.f48028a;
        }
        com.waze.car_lib.o.x xVar = (com.waze.car_lib.o.x) obj;
        h.g.b.x.f(xVar, "p0");
        el.d((el) this.receiver, xVar);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2, byte[] bArr) {
        super(1, obj, el.class, "openRequestRecordAudioPermission", "openRequestRecordAudioPermission(Lkotlin/jvm/functions/Function1;)V", 0);
        this.f21538a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2, char[] cArr) {
        super(1, obj, el.class, "pageSettingsClicked", "pageSettingsClicked(Lcom/waze/settings/tree/nodes/SettingPage;)V", 0);
        this.f21538a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2, int[] iArr) {
        super(1, obj, el.class, "messageSettingClicked", "messageSettingClicked(Lcom/waze/car_lib/settings/SettingMessage;)V", 0);
        this.f21538a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2, short[] sArr) {
        super(1, obj, el.class, "customPageSettingsClicked", "customPageSettingsClicked(Lcom/waze/car_lib/settings/SettingCustomPage;)V", 0);
        this.f21538a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(Object obj, int i2, boolean[] zArr) {
        super(1, obj, el.class, "onButtonClicked", "onButtonClicked(Lcom/waze/settings/tree/nodes/SettingCustomButton;)V", 0);
        this.f21538a = i2;
    }
}
