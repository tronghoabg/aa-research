package androidx.room;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.room.RoomDatabase;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Room {
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static /* synthetic */ RoomDatabase.Builder databaseBuilder$default(Room room, Context context, String str, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            x.i();
            aVar = AnonymousClass3.INSTANCE;
        }
        x.f(context, "context");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(aVar, "factory");
        if (o.G(str)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (x.n(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        x.i();
        int i3 = ar.f48106a;
        return new RoomDatabase.Builder(new m(RoomDatabase.class), str, aVar, context);
    }

    public static /* synthetic */ RoomDatabase.Builder inMemoryDatabaseBuilder$default(Room room, Context context, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            x.i();
            aVar = AnonymousClass1.INSTANCE;
        }
        x.f(context, "context");
        x.f(aVar, "factory");
        x.i();
        int i3 = ar.f48106a;
        return new RoomDatabase.Builder(new m(RoomDatabase.class), null, aVar, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, String str, a<? extends T> aVar) {
        x.f(context, "context");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(aVar, "factory");
        if (o.G(str)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (x.n(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        x.i();
        int i2 = ar.f48106a;
        return new RoomDatabase.Builder<>(new m(RoomDatabase.class), str, aVar, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, a<? extends T> aVar) {
        x.f(context, "context");
        x.f(aVar, "factory");
        x.i();
        int i2 = ar.f48106a;
        return new RoomDatabase.Builder<>(new m(RoomDatabase.class), null, aVar, context);
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        x.f(context, "context");
        x.f(cls, "klass");
        return new RoomDatabase.Builder<>(context, cls, null);
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> cls, String str) {
        x.f(context, "context");
        x.f(cls, "klass");
        String str2 = str;
        if (str2 != null && !o.G(str2)) {
            if (!x.n(str, ":memory:")) {
                return new RoomDatabase.Builder<>(context, cls, str);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
