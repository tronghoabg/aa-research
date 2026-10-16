package defpackage;

import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class bi implements fbd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bi(ContextWrapper contextWrapper, int i) {
        this.b = i;
        this.a = contextWrapper;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [cdp, java.lang.Object] */
    @Override // defpackage.fbd
    public final Bundle a() {
        int i = this.b;
        if (i == 0) {
            return ((bt) this.a).c();
        }
        if (i == 1) {
            bc bcVar = (bc) this.a;
            bcVar.gy();
            bcVar.a.e(epr.ON_STOP);
            return new Bundle();
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            ((ep) this.a).p();
            return bundle;
        }
        if (i == 3) {
            Bundle bundle2 = new Bundle();
            pc pcVar = ((ob) this.a).j;
            Map map = pcVar.b;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(pcVar.c));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(pcVar.f));
            return bundle2;
        }
        if (i != 4) {
            qru qruVar = (qru) this.a;
            qruVar.U();
            qruVar.l.e(epr.ON_STOP);
            return new Bundle();
        }
        int i2 = dbg.a;
        Map mapB = this.a.b();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : mapB.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle3.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle3;
    }

    public /* synthetic */ bi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
