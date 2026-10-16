package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    static final ab enqueue$lambda$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewNode.Request request, Throwable th) {
        bringIntoViewRequestPriorityQueue.requests.remove(request);
        return ab.f48028a;
    }

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        k[] kVarArr = new k[size];
        for (int i2 = 0; i2 < size; i2++) {
            kVarArr[i2] = mutableVector.content[i2].getContinuation();
        }
        for (int i3 = 0; i3 < size; i3++) {
            kVarArr[i3].f(th);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(final ContentInViewNode.Request request) {
        Rect rectInvoke = request.getCurrentBounds().invoke();
        if (rectInvoke == null) {
            request.getContinuation().resumeWith(ab.f48028a);
            return false;
        }
        request.getContinuation().c(new l() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BringIntoViewRequestPriorityQueue.enqueue$lambda$1(this.f$0, request, (Throwable) obj);
            }
        });
        j jVarU = n.u(0, this.requests.getSize());
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA <= iB) {
            while (true) {
                Rect rectInvoke2 = this.requests.content[iB].getCurrentBounds().invoke();
                if (rectInvoke2 != null) {
                    Rect rectIntersect = rectInvoke.intersect(rectInvoke2);
                    if (x.n(rectIntersect, rectInvoke)) {
                        this.requests.add(iB + 1, request);
                        return true;
                    }
                    if (!x.n(rectIntersect, rectInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= iB) {
                            while (true) {
                                this.requests.content[iB].getContinuation().f(cancellationException);
                                if (size == iB) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (iB == iA) {
                    break;
                }
                iB--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(l<? super Rect, ab> lVar) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                lVar.invoke(((ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
                size--;
            }
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.getSize() == 0;
    }

    public final void resumeAndRemoveAll() {
        j jVarU = n.u(0, this.requests.getSize());
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA <= iB) {
            while (true) {
                this.requests.content[iA].getContinuation().resumeWith(ab.f48028a);
                if (iA == iB) {
                    break;
                } else {
                    iA++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(l<? super Rect, Boolean> lVar) {
        while (this.requests.getSize() != 0 && lVar.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(ab.f48028a);
        }
    }
}
