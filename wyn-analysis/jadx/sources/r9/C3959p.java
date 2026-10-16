package r9;

import java.util.PriorityQueue;

/* renamed from: r9.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3959p {

    /* renamed from: c, reason: collision with root package name */
    public static final q6.d f44649c = new q6.d(12);

    /* renamed from: a, reason: collision with root package name */
    public int f44650a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44651b;

    public void a(Long l10) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f44651b;
        if (priorityQueue.size() < this.f44650a) {
            priorityQueue.add(l10);
            return;
        }
        if (l10.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l10);
        }
    }
}
