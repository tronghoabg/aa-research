package com.waze.ab;

import com.waze.config.ConfigValues;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class z implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13824a;

    public /* synthetic */ z(int i2) {
        this.f13824a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        Object obj = null;
        switch (this.f13824a) {
            case 8:
                int i2 = com.waze.main_screen.a.a.f25527a;
                break;
            case 11:
                ConfigValues.CONFIG_VALUE_DIALOGS_SAFETY_DIALOG_SHOWN.d(true);
                break;
            case 16:
                com.waze.main_screen.c.j jVar = com.waze.main_screen.c.j.f26251a;
                Long lB = ConfigValues.CONFIG_VALUE_BUTTON_PACK_POSITION.b();
                h.g.b.x.e(lB, "getValue(...)");
                long jLongValue = lB.longValue();
                Iterator<E> it = com.waze.main_screen.c.j.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((com.waze.main_screen.c.j) next).f26255e == jLongValue) {
                            obj = next;
                        }
                    }
                }
                com.waze.main_screen.c.j jVar2 = (com.waze.main_screen.c.j) obj;
                if (jVar2 == null) {
                    break;
                }
                break;
            case 17:
                com.waze.main_screen.c.d dVar = com.waze.main_screen.c.d.f26167a;
                Long lB2 = ConfigValues.CONFIG_VALUE_BUTTON_PACK_ORDER.b();
                h.g.b.x.e(lB2, "getValue(...)");
                long jLongValue2 = lB2.longValue();
                Iterator<E> it2 = com.waze.main_screen.c.d.b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((com.waze.main_screen.c.d) next2).a() == jLongValue2) {
                            obj = next2;
                        }
                    }
                }
                com.waze.main_screen.c.d dVar2 = (com.waze.main_screen.c.d) obj;
                if (dVar2 == null) {
                    break;
                }
                break;
            case 18:
                int i3 = com.waze.main_screen.c.a.a.f26078a;
                break;
        }
        return h.ab.f48028a;
    }
}
