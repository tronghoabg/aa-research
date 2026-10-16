package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class rxb implements rxe {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rxb(Uri uri, ContentValues contentValues, int i) {
        this.c = i;
        this.a = uri;
        this.b = contentValues;
    }

    @Override // defpackage.rxe
    public final void a(ContentProviderClient contentProviderClient) throws RemoteException {
        if (this.c == 0) {
            ypf ypfVar = rxf.a;
            contentProviderClient.update((Uri) this.a, (ContentValues) this.b, null, null);
            return;
        }
        ypf ypfVar2 = rxf.a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("detector_type", Integer.valueOf(((yxo) this.b).r));
        Uri uriInsert = contentProviderClient.insert(rxj.a, contentValues);
        if (uriInsert == null) {
            return;
        }
        String lastPathSegment = uriInsert.getLastPathSegment();
        if (lastPathSegment == null) {
            throw new IllegalArgumentException("uri does not contain UUID path and value");
        }
        AtomicReference atomicReference = (AtomicReference) this.a;
        atomicReference.set(UUID.fromString(lastPathSegment));
        atomicReference.get();
    }

    public /* synthetic */ rxb(yxo yxoVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = yxoVar;
        this.a = atomicReference;
    }
}
