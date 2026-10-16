package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.KeepFields;
import androidx.car.app.serialization.IRemoteList;
import androidx.car.app.utils.RemoteUtils;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
@KeepFields
@CarProtocol
/* loaded from: classes2.dex */
public final class ListDelegateImpl<T> implements ListDelegate<T> {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    /* compiled from: WazeSource */
    final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            x.f(list, "mContent");
            this.mContent = list;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int i2, final int i3, IOnDoneCallback iOnDoneCallback) {
            x.f(iOnDoneCallback, "callback");
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "lazy load content", new RemoteUtils.HostCall() { // from class: androidx.car.app.serialization.ListDelegateImpl$RemoteListStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.mContent.subList(i2, i3 + 1);
                }
            });
        }
    }

    public ListDelegateImpl(List<? extends T> list) {
        x.f(list, "content");
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ListDelegateImpl) && ((ListDelegateImpl) obj).listHashCode == this.listHashCode;
    }

    @Override // androidx.car.app.serialization.ListDelegate
    public int getSize() {
        return this._size;
    }

    public int hashCode() {
        return this.listHashCode;
    }

    @Override // androidx.car.app.serialization.ListDelegate
    public void requestItemRange(int i2, int i3, OnDoneCallback onDoneCallback) {
        x.f(onDoneCallback, "callback");
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                x.j("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(i2, i3, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() {
        return "ListDelegate { Size: " + getSize() + ", listHashCode: " + this.listHashCode + " }";
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
