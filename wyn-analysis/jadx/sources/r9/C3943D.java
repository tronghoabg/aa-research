package r9;

import android.database.Cursor;
import java.util.HashMap;
import ka.AbstractC3230e0;
import w9.InterfaceC4388g;

/* renamed from: r9.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3943D implements InterfaceC4388g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44551b;

    public /* synthetic */ C3943D(Object obj, int i5) {
        this.f44550a = i5;
        this.f44551b = obj;
    }

    @Override // w9.InterfaceC4388g
    public final void accept(Object obj) {
        Object obj2 = this.f44551b;
        switch (this.f44550a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((HashMap) obj2).put(Integer.valueOf(cursor.getInt(0)), new s9.c(cursor.getLong(1), new s9.b(new s9.o(new s8.q(cursor.getLong(2), cursor.getInt(3))), new s9.h(AbstractC3230e0.l(cursor.getString(4))), cursor.getInt(5))));
                return;
            case 1:
                Boolean[] boolArr = (Boolean[]) obj2;
                try {
                    if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e7) {
                    A6.c.s("SQLitePersistence.DataMigration failed to parse: %s", e7);
                    throw null;
                }
            default:
                Cursor cursor2 = (Cursor) obj;
                O o7 = (O) obj2;
                o7.getClass();
                o7.f44592c = cursor2.getInt(0);
                o7.f44593d = cursor2.getInt(1);
                o7.f44594e = new s9.o(new s8.q(cursor2.getLong(2), cursor2.getInt(3)));
                o7.f44595f = cursor2.getLong(4);
                return;
        }
    }
}
