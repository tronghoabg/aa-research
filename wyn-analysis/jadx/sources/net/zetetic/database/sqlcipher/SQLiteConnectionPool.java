package net.zetetic.database.sqlcipher;

import N0.a;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteConnection;

/* loaded from: classes5.dex */
public final class SQLiteConnectionPool implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f41081d;

    /* renamed from: e, reason: collision with root package name */
    public int f41082e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41083f;

    /* renamed from: g, reason: collision with root package name */
    public int f41084g;

    /* renamed from: h, reason: collision with root package name */
    public ConnectionWaiter f41085h;

    /* renamed from: i, reason: collision with root package name */
    public ConnectionWaiter f41086i;
    public SQLiteConnection k;

    /* renamed from: a, reason: collision with root package name */
    public final CloseGuard f41078a = new CloseGuard();

    /* renamed from: b, reason: collision with root package name */
    public final Object f41079b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f41080c = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f41087j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final WeakHashMap f41088l = new WeakHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AcquiredConnectionStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final AcquiredConnectionStatus f41092a;

        /* renamed from: b, reason: collision with root package name */
        public static final AcquiredConnectionStatus f41093b;

        /* renamed from: c, reason: collision with root package name */
        public static final AcquiredConnectionStatus f41094c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AcquiredConnectionStatus[] f41095d;

        static {
            AcquiredConnectionStatus acquiredConnectionStatus = new AcquiredConnectionStatus("NORMAL", 0);
            f41092a = acquiredConnectionStatus;
            AcquiredConnectionStatus acquiredConnectionStatus2 = new AcquiredConnectionStatus("RECONFIGURE", 1);
            f41093b = acquiredConnectionStatus2;
            AcquiredConnectionStatus acquiredConnectionStatus3 = new AcquiredConnectionStatus("DISCARD", 2);
            f41094c = acquiredConnectionStatus3;
            f41095d = new AcquiredConnectionStatus[]{acquiredConnectionStatus, acquiredConnectionStatus2, acquiredConnectionStatus3};
        }

        public static AcquiredConnectionStatus valueOf(String str) {
            return (AcquiredConnectionStatus) Enum.valueOf(AcquiredConnectionStatus.class, str);
        }

        public static AcquiredConnectionStatus[] values() {
            return (AcquiredConnectionStatus[]) f41095d.clone();
        }
    }

    public static final class ConnectionWaiter {

        /* renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f41096a;

        /* renamed from: b, reason: collision with root package name */
        public Thread f41097b;

        /* renamed from: c, reason: collision with root package name */
        public long f41098c;

        /* renamed from: d, reason: collision with root package name */
        public int f41099d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f41100e;

        /* renamed from: f, reason: collision with root package name */
        public String f41101f;

        /* renamed from: g, reason: collision with root package name */
        public int f41102g;

        /* renamed from: h, reason: collision with root package name */
        public SQLiteConnection f41103h;

        /* renamed from: i, reason: collision with root package name */
        public RuntimeException f41104i;

        /* renamed from: j, reason: collision with root package name */
        public int f41105j;
    }

    public SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f41081d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        J();
    }

    public static void b(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.g(false);
        } catch (RuntimeException e7) {
            Logger.a(e7, "SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection);
        }
    }

    public final boolean B(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        AcquiredConnectionStatus acquiredConnectionStatus2 = AcquiredConnectionStatus.f41093b;
        AcquiredConnectionStatus acquiredConnectionStatus3 = AcquiredConnectionStatus.f41094c;
        if (acquiredConnectionStatus == acquiredConnectionStatus2) {
            try {
                sQLiteConnection.r(this.f41081d);
            } catch (RuntimeException e7) {
                Logger.a(e7, "SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection);
                acquiredConnectionStatus = acquiredConnectionStatus3;
            }
        }
        if (acquiredConnectionStatus != acquiredConnectionStatus3) {
            return true;
        }
        b(sQLiteConnection);
        return false;
    }

    public final void D(SQLiteConnection sQLiteConnection) {
        synchronized (this.f41079b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatus = (AcquiredConnectionStatus) this.f41088l.remove(sQLiteConnection);
                if (acquiredConnectionStatus == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f41083f) {
                    b(sQLiteConnection);
                } else if (sQLiteConnection.f41051e) {
                    if (B(sQLiteConnection, acquiredConnectionStatus)) {
                        this.k = sQLiteConnection;
                    }
                    W();
                } else if (this.f41087j.size() >= this.f41082e - 1) {
                    b(sQLiteConnection);
                } else {
                    if (B(sQLiteConnection, acquiredConnectionStatus)) {
                        this.f41087j.add(sQLiteConnection);
                    }
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J() {
        if ((this.f41081d.f41127c & 536870912) != 0) {
            this.f41082e = 10;
        } else {
            this.f41082e = 1;
        }
    }

    public final void P() {
        if (!this.f41083f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    public final SQLiteConnection Q(int i5, String str) {
        ArrayList arrayList = this.f41087j;
        int size = arrayList.size();
        if (size > 1 && str != null) {
            for (int i10 = 0; i10 < size; i10++) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) arrayList.get(i10);
                if (sQLiteConnection.f41053g.get(str) != null) {
                    arrayList.remove(i10);
                    h(sQLiteConnection, i5);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.remove(size - 1);
            h(sQLiteConnection2, i5);
            return sQLiteConnection2;
        }
        int size2 = this.f41088l.size();
        if (this.k != null) {
            size2++;
        }
        if (size2 >= this.f41082e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionW = w(this.f41081d, false);
        h(sQLiteConnectionW, i5);
        return sQLiteConnectionW;
    }

    public final SQLiteConnection V(int i5) {
        SQLiteConnection sQLiteConnection = this.k;
        if (sQLiteConnection != null) {
            this.k = null;
            h(sQLiteConnection, i5);
            return sQLiteConnection;
        }
        Iterator it = this.f41088l.keySet().iterator();
        while (it.hasNext()) {
            if (((SQLiteConnection) it.next()).f41051e) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionW = w(this.f41081d, true);
        h(sQLiteConnectionW, i5);
        return sQLiteConnectionW;
    }

    public final void W() {
        SQLiteConnection sQLiteConnectionV;
        ConnectionWaiter connectionWaiter = this.f41086i;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z2 = false;
        boolean z10 = false;
        while (connectionWaiter != null) {
            boolean z11 = true;
            if (this.f41083f) {
                try {
                    if (connectionWaiter.f41100e || z2) {
                        sQLiteConnectionV = null;
                    } else {
                        sQLiteConnectionV = Q(connectionWaiter.f41102g, connectionWaiter.f41101f);
                        if (sQLiteConnectionV == null) {
                            z2 = true;
                        }
                    }
                    if (sQLiteConnectionV == null && !z10 && (sQLiteConnectionV = V(connectionWaiter.f41102g)) == null) {
                        z10 = true;
                    }
                    if (sQLiteConnectionV != null) {
                        connectionWaiter.f41103h = sQLiteConnectionV;
                    } else if (z2 && z10) {
                        return;
                    } else {
                        z11 = false;
                    }
                } catch (RuntimeException e7) {
                    connectionWaiter.f41104i = e7;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f41096a;
            if (z11) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f41096a = connectionWaiter3;
                } else {
                    this.f41086i = connectionWaiter3;
                }
                connectionWaiter.f41096a = null;
                LockSupport.unpark(connectionWaiter.f41097b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public final void a() {
        ArrayList arrayList = this.f41087j;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            b((SQLiteConnection) arrayList.get(i5));
        }
        arrayList.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(false);
    }

    public final void d(boolean z2) {
        Throwable th;
        CloseGuard closeGuard = this.f41078a;
        if (z2 && (th = closeGuard.f41043a) != null) {
            Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
        }
        this.f41078a.f41043a = null;
        if (z2) {
            return;
        }
        synchronized (this.f41079b) {
            try {
                P();
                this.f41083f = false;
                a();
                SQLiteConnection sQLiteConnection = this.k;
                if (sQLiteConnection != null) {
                    b(sQLiteConnection);
                    this.k = null;
                }
                int size = this.f41088l.size();
                if (size != 0) {
                    Logger.b().a(4, null, "SQLiteConnectionPool", "The connection pool for " + this.f41081d.f41126b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                W();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            d(true);
        } finally {
            super.finalize();
        }
    }

    public final void h(SQLiteConnection sQLiteConnection, int i5) {
        try {
            sQLiteConnection.k = (i5 & 1) != 0;
            this.f41088l.put(sQLiteConnection, AcquiredConnectionStatus.f41092a);
        } catch (RuntimeException e7) {
            Logger.b().a(6, null, "SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i5);
            b(sQLiteConnection);
            throw e7;
        }
    }

    public final void i(int i5, long j8) {
        int i10;
        String string;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder("The connection pool for database '");
        sb2.append(this.f41081d.f41126b);
        sb2.append("' has been unable to grant a connection to thread ");
        sb2.append(threadCurrentThread.getId());
        sb2.append(" (");
        sb2.append(threadCurrentThread.getName());
        sb2.append(") with flags 0x");
        sb2.append(Integer.toHexString(i5));
        sb2.append(" for ");
        sb2.append(j8 * 0.001f);
        sb2.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (this.f41088l.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = this.f41088l.keySet().iterator();
            i10 = 0;
            while (it.hasNext()) {
                SQLiteConnection.OperationLog operationLog = ((SQLiteConnection) it.next()).f41055i;
                synchronized (operationLog.f41067a) {
                    try {
                        SQLiteConnection.Operation operation = operationLog.f41067a[operationLog.f41068b];
                        if (operation == null || operation.f41064g) {
                            string = null;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            operation.a(sb3);
                            string = sb3.toString();
                        }
                    } finally {
                    }
                }
                if (string != null) {
                    arrayList.add(string);
                    i11++;
                } else {
                    i10++;
                }
            }
        }
        int size = this.f41087j.size();
        if (this.k != null) {
            size++;
        }
        a.l(i11, i10, "Connections: ", " active, ", sb2);
        sb2.append(" idle, ");
        sb2.append(size);
        sb2.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb2.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.r(sb2, "  ", (String) it2.next(), "\n");
            }
        }
        Logger.b().a(5, null, "SQLiteConnectionPool", sb2.toString());
    }

    public final void o(AcquiredConnectionStatus acquiredConnectionStatus) {
        WeakHashMap weakHashMap = this.f41088l;
        if (weakHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(weakHashMap.size());
        for (Map.Entry entry : weakHashMap.entrySet()) {
            AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) entry.getValue();
            if (acquiredConnectionStatus != acquiredConnectionStatus2 && acquiredConnectionStatus2 != AcquiredConnectionStatus.f41094c) {
                arrayList.add((SQLiteConnection) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            weakHashMap.put((SQLiteConnection) arrayList.get(i5), acquiredConnectionStatus);
        }
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.f41081d.f41125a;
    }

    public final SQLiteConnection w(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z2) {
        int i5 = this.f41084g;
        this.f41084g = i5 + 1;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(this, sQLiteDatabaseConfiguration, i5, z2);
        try {
            sQLiteConnection.p();
            return sQLiteConnection;
        } catch (SQLiteException e7) {
            sQLiteConnection.g(false);
            throw e7;
        }
    }

    public final void y(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f41079b) {
            try {
                P();
                boolean z2 = ((sQLiteDatabaseConfiguration.f41127c ^ this.f41081d.f41127c) & 536870912) != 0;
                if (z2) {
                    if (!this.f41088l.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    a();
                }
                this.f41081d.getClass();
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f41130f, this.f41081d.f41130f)) {
                    this.k.e(sQLiteDatabaseConfiguration.f41130f);
                    this.f41081d.a(sQLiteDatabaseConfiguration);
                    a();
                    z();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f41081d;
                if (sQLiteDatabaseConfiguration2.f41127c != sQLiteDatabaseConfiguration.f41127c) {
                    if (z2) {
                        a();
                        SQLiteConnection sQLiteConnection = this.k;
                        if (sQLiteConnection != null) {
                            b(sQLiteConnection);
                            this.k = null;
                        }
                    }
                    SQLiteConnection sQLiteConnectionW = w(sQLiteDatabaseConfiguration, true);
                    a();
                    SQLiteConnection sQLiteConnection2 = this.k;
                    if (sQLiteConnection2 != null) {
                        b(sQLiteConnection2);
                        this.k = null;
                    }
                    o(AcquiredConnectionStatus.f41094c);
                    this.k = sQLiteConnectionW;
                    this.f41081d.a(sQLiteDatabaseConfiguration);
                    J();
                } else {
                    sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
                    J();
                    ArrayList arrayList = this.f41087j;
                    int size = arrayList.size();
                    while (true) {
                        int i5 = size - 1;
                        if (size <= this.f41082e - 1) {
                            break;
                        }
                        b((SQLiteConnection) arrayList.remove(i5));
                        size = i5;
                    }
                    z();
                }
                W();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        SQLiteConnection sQLiteConnection = this.k;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41081d;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.r(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e7) {
                Logger.a(e7, "SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.k);
                b(this.k);
                this.k = null;
            }
        }
        ArrayList arrayList = this.f41087j;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.get(i5);
            try {
                sQLiteConnection2.r(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e10) {
                Logger.a(e10, "SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2);
                b(sQLiteConnection2);
                arrayList.remove(i5);
                size--;
                i5--;
            }
            i5++;
        }
        o(AcquiredConnectionStatus.f41093b);
    }
}
