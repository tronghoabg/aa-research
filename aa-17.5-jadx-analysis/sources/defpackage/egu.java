package defpackage;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class egu extends FileObserver {
    public static final Object a = new Object();
    public static final Map b = new LinkedHashMap();
    public final CopyOnWriteArrayList c;

    public egu(String str) {
        super(str, 128);
        this.c = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((afec) it.next()).invoke(str);
        }
    }
}
