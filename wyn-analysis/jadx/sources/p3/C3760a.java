package p3;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.AbstractC3340k;
import tf.r;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3760a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o3.f f43202a;

    @Override // tf.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        AbstractC3340k.b(sQLiteQuery);
        this.f43202a.b(new i(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
