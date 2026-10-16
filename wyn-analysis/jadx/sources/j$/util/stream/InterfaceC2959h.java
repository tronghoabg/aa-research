package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2959h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC2959h onClose(Runnable runnable);

    InterfaceC2959h parallel();

    InterfaceC2959h sequential();

    Spliterator spliterator();

    InterfaceC2959h unordered();
}
