package com.waze.google_assistant;

import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.jni.protos.settings.SettingsValueProto;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24231a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24232b;

    public /* synthetic */ o(Object obj, int i2) {
        this.f24232b = i2;
        this.f24231a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        ArrayList arrayListH;
        List<SettingsValueProto> valuesList;
        if (this.f24232b == 0) {
            return aa.g((aa) this.f24231a, (com.waze.sharedui.e.c) obj);
        }
        SettingsValueListProto settingsValueListProto = (SettingsValueListProto) obj;
        if (settingsValueListProto == null || (valuesList = settingsValueListProto.getValuesList()) == null) {
            arrayListH = h.a.i.h();
        } else {
            List<SettingsValueProto> list = valuesList;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            for (SettingsValueProto settingsValueProto : list) {
                h.g.b.x.c(settingsValueProto);
                arrayList.add(com.waze.network.f.ak.o(settingsValueProto));
            }
            arrayListH = arrayList;
        }
        this.f24231a.a(arrayListH);
        return h.ab.f48028a;
    }
}
