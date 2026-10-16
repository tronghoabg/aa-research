package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.KeepFields;
import androidx.car.app.serialization.IRemoteList;
import androidx.car.app.serialization.ListDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001aB\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0012¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\bH\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl;", "T", "Landroidx/car/app/serialization/ListDelegate;", "content", "", "(Ljava/util/List;)V", "()V", "_size", "", "listHashCode", "mStub", "Landroidx/car/app/serialization/IRemoteList;", "size", "getSize", "()I", "equals", "", "other", "", "hashCode", "requestItemRange", "", "startIndex", "endIndex", "callback", "Landroidx/car/app/OnDoneCallback;", "RemoteListStub", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@KeepFields
/* loaded from: classes.dex */
public final class ListDelegateImpl<T> implements ListDelegate<T> {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl$RemoteListStub;", "T", "Landroidx/car/app/serialization/IRemoteList$Stub;", "mContent", "", "(Ljava/util/List;)V", "requestItemRange", "", "startIndex", "", "endIndex", "callback", "Landroidx/car/app/IOnDoneCallback;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "mContent");
            this.mContent = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object requestItemRange$lambda$0(RemoteListStub remoteListStub, int i, int i2) {
            return remoteListStub.mContent.subList(i, i2 + 1);
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int startIndex, final int endIndex, IOnDoneCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteUtils.dispatchCallFromHost(callback, "lazy load content", new RemoteUtils.HostCall() { // from class: androidx.car.app.serialization.a
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return ListDelegateImpl.RemoteListStub.requestItemRange$lambda$0(this.a, startIndex, endIndex);
                }
            });
        }
    }

    public ListDelegateImpl(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "content");
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object other) {
        return (other instanceof ListDelegateImpl) && ((ListDelegateImpl) other).listHashCode == this.listHashCode;
    }

    @Override // androidx.car.app.serialization.ListDelegate
    /* renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getListHashCode() {
        return this.listHashCode;
    }

    @Override // androidx.car.app.serialization.ListDelegate
    public void requestItemRange(int startIndex, int endIndex, OnDoneCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        get_size();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(startIndex, endIndex, RemoteUtils.createOnDoneCallbackStub(callback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
