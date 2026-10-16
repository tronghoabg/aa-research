package androidx.room;

import androidx.sqlite.SQLiteStatement;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface PooledConnection {
    <R> Object usePrepared(String str, l<? super SQLiteStatement, ? extends R> lVar, e<? super R> eVar);
}
