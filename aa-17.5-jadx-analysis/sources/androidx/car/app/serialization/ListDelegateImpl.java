package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.IRemoteList;
import androidx.car.app.utils.RemoteUtils$1;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import defpackage.affa;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.xs;
import defpackage.xy;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001:\u0001\u001dB\u0017\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0012¢\u0006\u0004\b\u0005\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl;", "T", "Landroidx/car/app/serialization/ListDelegate;", "content", "", "<init>", "(Ljava/util/List;)V", "()V", "_size", "", "listHashCode", "mStub", "Landroidx/car/app/serialization/IRemoteList;", "size", "getSize", "()I", "requestItemRange", "", "startIndex", "endIndex", "callback", "Landroidx/car/app/OnDoneCallback;", "equals", "", "other", "", "hashCode", "toString", "", "RemoteListStub", CloudRecognizerProtocolStrings.APP}, k = 1, mv = {2, 1, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class ListDelegateImpl<T> implements xs<T> {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl$RemoteListStub;", "T", "Landroidx/car/app/serialization/IRemoteList$Stub;", "mContent", "", "<init>", "(Ljava/util/List;)V", "requestItemRange", "", "startIndex", "", "endIndex", "callback", "Landroidx/car/app/IOnDoneCallback;", "getInterfaceVersion", CloudRecognizerProtocolStrings.APP}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            list.getClass();
            this.mContent = list;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int startIndex, final int endIndex, IOnDoneCallback callback) throws RemoteException {
            callback.getClass();
            tr.b(callback, "lazy load content", new xy() { // from class: xt
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.mContent.subList(startIndex, endIndex + 1);
                }
            });
        }
    }

    public ListDelegateImpl(List<? extends T> list) {
        list.getClass();
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object other) {
        return (other instanceof ListDelegateImpl) && ((ListDelegateImpl) other).listHashCode == this.listHashCode;
    }

    @Override // defpackage.xs
    /* renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getListHashCode() {
        return this.listHashCode;
    }

    @Override // defpackage.xs
    public void requestItemRange(int i, int i2, qu quVar) {
        quVar.getClass();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                affa.d("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(i, i2, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "ListDelegate { Size: " + get_size() + ", listHashCode: " + this.listHashCode + " }";
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
