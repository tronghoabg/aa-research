package o3;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3644a extends Closeable {
    g A(String str);

    Cursor K(String str);

    boolean O();

    boolean R();

    int U(ContentValues contentValues, Object[] objArr);

    void c();

    void f(String str);

    boolean isOpen();

    void k();

    void l(String str, Object[] objArr);

    void n();

    void p();

    Cursor t(f fVar);
}
