package androidx.room;

import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Binding {
    }

    private RoomSQLiteQuery(int i2) {
        this.capacity = i2;
        int i3 = i2 + 1;
        this.bindingTypes = new int[i3];
        this.longBindings = new long[i3];
        this.doubleBindings = new double[i3];
        this.stringBindings = new String[i3];
        this.blobBindings = new byte[i3][];
    }

    public static final RoomSQLiteQuery acquire(String str, int i2) {
        return Companion.acquire(str, i2);
    }

    public static final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    static final ab toRoomRawQuery$lambda$1(RoomSQLiteQuery roomSQLiteQuery, SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "it");
        roomSQLiteQuery.bindTo(sQLiteStatement);
        return ab.f48028a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i2, byte[] bArr) {
        x.f(bArr, "value");
        this.bindingTypes[i2] = 5;
        this.blobBindings[i2] = bArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i2, double d2) {
        this.bindingTypes[i2] = 3;
        this.doubleBindings[i2] = d2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i2, long j2) {
        this.bindingTypes[i2] = 2;
        this.longBindings[i2] = j2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i2) {
        this.bindingTypes[i2] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i2, String str) {
        x.f(str, "value");
        this.bindingTypes[i2] = 4;
        this.stringBindings[i2] = str;
    }

    public final void bindText(int i2, String str) {
        x.f(str, "value");
        bindString(i2, str);
    }

    public final void bindTo(SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "statement");
        int argCount = getArgCount();
        if (argCount <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.bindingTypes[i2];
            if (i3 == 1) {
                sQLiteStatement.mo13247bindNull(i2);
            } else if (i3 == 2) {
                sQLiteStatement.mo13246bindLong(i2, this.longBindings[i2]);
            } else if (i3 == 3) {
                sQLiteStatement.mo13245bindDouble(i2, this.doubleBindings[i2]);
            } else if (i3 == 4) {
                String str = this.stringBindings[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sQLiteStatement.mo13248bindText(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.blobBindings[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sQLiteStatement.mo13244bindBlob(i2, bArr);
            }
            if (i2 == argCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        c.ay(this.bindingTypes, 1, 0, 6);
        String[] strArr = this.stringBindings;
        c.j(strArr, null, 0, strArr.length);
        byte[][] bArr = this.blobBindings;
        c.j(bArr, null, 0, bArr.length);
        this.query = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery roomSQLiteQuery) {
        x.f(roomSQLiteQuery, "other");
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        System.arraycopy(roomSQLiteQuery.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(roomSQLiteQuery.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void init(String str, int i2) {
        x.f(str, "query");
        this.query = str;
        this.argCount = i2;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime();
        }
    }

    public final RoomRawQuery toRoomRawQuery() {
        return new RoomRawQuery(getSql(), new l() { // from class: androidx.room.RoomSQLiteQuery$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RoomSQLiteQuery.toRoomRawQuery$lambda$1(this.f$0, (SQLiteStatement) obj);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }

        public final RoomSQLiteQuery acquire(String str, int i2) {
            x.f(str, "query");
            synchronized (RoomSQLiteQuery.queryPool) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = RoomSQLiteQuery.queryPool.ceilingEntry(Integer.valueOf(i2));
                if (entryCeilingEntry == null) {
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2, null);
                    roomSQLiteQuery.init(str, i2);
                    return roomSQLiteQuery;
                }
                RoomSQLiteQuery.queryPool.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery value = entryCeilingEntry.getValue();
                value.init(str, i2);
                x.c(value);
                return value;
            }
        }

        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
            x.f(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int i2, byte[] bArr) {
                    x.f(bArr, "value");
                    roomSQLiteQueryAcquire.bindBlob(i2, bArr);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int i2, double d2) {
                    roomSQLiteQueryAcquire.bindDouble(i2, d2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int i2, long j2) {
                    roomSQLiteQueryAcquire.bindLong(i2, j2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int i2) {
                    roomSQLiteQueryAcquire.bindNull(i2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int i2, String str) {
                    x.f(str, "value");
                    roomSQLiteQueryAcquire.bindString(i2, str);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        public final void prunePoolLocked$room_runtime() {
            if (RoomSQLiteQuery.queryPool.size() > 15) {
                Iterator<Integer> it = RoomSQLiteQuery.queryPool.descendingKeySet().iterator();
                x.e(it, "iterator(...)");
                for (int size = RoomSQLiteQuery.queryPool.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i2, o oVar) {
        this(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        x.f(supportSQLiteProgram, "statement");
        int argCount = getArgCount();
        if (argCount <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.bindingTypes[i2];
            if (i3 == 1) {
                supportSQLiteProgram.bindNull(i2);
            } else if (i3 == 2) {
                supportSQLiteProgram.bindLong(i2, this.longBindings[i2]);
            } else if (i3 == 3) {
                supportSQLiteProgram.bindDouble(i2, this.doubleBindings[i2]);
            } else if (i3 == 4) {
                String str = this.stringBindings[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.bindString(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.blobBindings[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.bindBlob(i2, bArr);
            }
            if (i2 == argCount) {
                return;
            } else {
                i2++;
            }
        }
    }
}
