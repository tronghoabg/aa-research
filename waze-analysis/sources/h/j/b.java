package h.j;

import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
