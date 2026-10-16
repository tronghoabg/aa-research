package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.fo;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BundleableByteArray {
    private static final String FIELD_IN_PROCESS_BINDER = Util.intToStringMaxRadix(0);
    private static final String FIELD_SHARED_MEMORY = Util.intToStringMaxRadix(1);
    private static final String FIELD_SPLIT_ARRAY_RETRIEVER = Util.intToStringMaxRadix(2);
    private static final String TAG = "BundleableByteArray";
    private final byte[] byteArray;
    private final InProcessBinder inProcessBinder = new InProcessBinder();
    SharedMemoryApi27 sharedMemoryApi27;
    SplitArrayRetriever splitArrayRetriever;

    /* compiled from: WazeSource */
    final class InProcessBinder extends Binder {
        final /* synthetic */ BundleableByteArray this$0;

        private InProcessBinder(BundleableByteArray bundleableByteArray) {
            Objects.requireNonNull(bundleableByteArray);
            this.this$0 = bundleableByteArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] getByteArray() {
            return this.this$0.byteArray;
        }
    }

    /* compiled from: WazeSource */
    final class SharedMemoryApi27 {
        private final SharedMemory sharedMemory;

        private SharedMemoryApi27(SharedMemory sharedMemory) {
            this.sharedMemory = sharedMemory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SharedMemoryApi27 create(byte[] bArr) throws ErrnoException {
            Exception e2;
            SharedMemory sharedMemoryCreate;
            try {
                sharedMemoryCreate = SharedMemory.create(BundleableByteArray.TAG, bArr.length);
            } catch (Exception e3) {
                e2 = e3;
                sharedMemoryCreate = null;
            }
            try {
                ByteBuffer byteBufferMapReadWrite = sharedMemoryCreate.mapReadWrite();
                byteBufferMapReadWrite.put(bArr);
                SharedMemory.unmap(byteBufferMapReadWrite);
                sharedMemoryCreate.setProtect(OsConstants.PROT_READ);
                return new SharedMemoryApi27(sharedMemoryCreate);
            } catch (Exception e4) {
                e2 = e4;
                Log.w(BundleableByteArray.TAG, "Failed to allocate shared memory for byte array, size=" + bArr.length, e2);
                if (sharedMemoryCreate != null) {
                    sharedMemoryCreate.close();
                }
                return null;
            }
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to calculate best type for var: r0v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v3 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v4 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:39), block:B:11:0x0026 */
        public static byte[] readFromBundle(android.os.Bundle r6) throws java.lang.Throwable {
            /*
                java.lang.String r0 = androidx.media3.common.BundleableByteArray.m11992$$Nest$sfgetFIELD_SHARED_MEMORY()
                android.os.Parcelable r6 = r6.getParcelable(r0)
                android.os.SharedMemory r6 = com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m(r6)
                r0 = 0
                if (r6 == 0) goto L49
                java.nio.ByteBuffer r1 = com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m13510m(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
                int r2 = com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m(r6)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L2a
                byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L2a
                r1.get(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L2a
                if (r1 == 0) goto L21
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m(r1)
            L21:
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m13511m(r6)
                return r2
            L25:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L40
            L2a:
                r2 = move-exception
                goto L30
            L2c:
                r1 = move-exception
                goto L40
            L2e:
                r2 = move-exception
                r1 = r0
            L30:
                java.lang.String r3 = "BundleableByteArray"
                java.lang.String r4 = "Failed to read byte array from shared memory"
                androidx.media3.common.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L3c
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m(r1)
            L3c:
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m13511m(r6)
                return r0
            L40:
                if (r0 == 0) goto L45
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m(r0)
            L45:
                com.bumptech.glide.load.c.a.bc$$ExternalSyntheticApiModelOutline0.m13511m(r6)
                throw r1
            L49:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.BundleableByteArray.SharedMemoryApi27.readFromBundle(android.os.Bundle):byte[]");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(Bundle bundle) {
            bundle.putParcelable(BundleableByteArray.FIELD_SHARED_MEMORY, this.sharedMemory);
        }
    }

    /* compiled from: WazeSource */
    final class SplitArrayRetriever {
        private static final String BUNDLE_KEY = "bytes";
        private static final int CHUNK_SIZE = C.SUGGESTED_MAX_IPC_SIZE;
        private final BundleListRetriever bundleListRetriever;

        private SplitArrayRetriever(byte[] bArr) {
            int i2 = bn.f7456d;
            bi biVar = new bi();
            int iCeilDivide = Util.ceilDivide(bArr.length, CHUNK_SIZE);
            for (int i3 = 0; i3 < iCeilDivide; i3++) {
                Bundle bundle = new Bundle();
                int i4 = CHUNK_SIZE;
                int i5 = i3 * i4;
                bundle.putByteArray(BUNDLE_KEY, Arrays.copyOfRange(bArr, i5, Math.min(i4 + i5, bArr.length)));
                biVar.g(bundle);
            }
            this.bundleListRetriever = new BundleListRetriever(biVar.f());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] readFromBundle(Bundle bundle) {
            IBinder binder = bundle.getBinder(BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER);
            if (binder != null) {
                try {
                    bn<Bundle> list = BundleListRetriever.getList(binder);
                    if (list.isEmpty()) {
                        return Util.EMPTY_BYTE_ARRAY;
                    }
                    byte[] byteArray = ((Bundle) fo.Q(list)).getByteArray(BUNDLE_KEY);
                    if (byteArray == null) {
                        return null;
                    }
                    int size = list.size() - 1;
                    int i2 = CHUNK_SIZE * size;
                    int length = byteArray.length;
                    byte[] bArr = new byte[i2 + length];
                    System.arraycopy(byteArray, 0, bArr, i2, length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = list.get(i3).getByteArray(BUNDLE_KEY);
                        if (byteArray2 != null) {
                            int length2 = byteArray2.length;
                            int i4 = CHUNK_SIZE;
                            if (length2 == i4) {
                                System.arraycopy(byteArray2, 0, bArr, i3 * i4, i4);
                            }
                        }
                        return null;
                    }
                    return bArr;
                } catch (RuntimeException e2) {
                    Log.w(BundleableByteArray.TAG, "Failed to read byte array from bundle list retriever", e2);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(Bundle bundle) {
            bundle.putBinder(BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER, this.bundleListRetriever);
        }
    }

    /* renamed from: -$$Nest$sfgetFIELD_SHARED_MEMORY, reason: not valid java name */
    static /* bridge */ /* synthetic */ String m11992$$Nest$sfgetFIELD_SHARED_MEMORY() {
        return FIELD_SHARED_MEMORY;
    }

    public BundleableByteArray(byte[] bArr) {
        this.byteArray = bArr;
    }

    public static byte[] fromBundle(Bundle bundle) throws Throwable {
        IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder == null) {
            return null;
        }
        if (binder instanceof InProcessBinder) {
            return ((InProcessBinder) binder).getByteArray();
        }
        byte[] fromBundle = SharedMemoryApi27.readFromBundle(bundle);
        return fromBundle != null ? fromBundle : SplitArrayRetriever.readFromBundle(bundle);
    }

    public Bundle toBundle() throws ErrnoException {
        Bundle bundle = new Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, this.inProcessBinder);
        byte[] bArr = this.byteArray;
        if (bArr.length > 0) {
            SharedMemoryApi27 sharedMemoryApi27Create = this.sharedMemoryApi27;
            if (sharedMemoryApi27Create == null) {
                sharedMemoryApi27Create = SharedMemoryApi27.create(bArr);
                this.sharedMemoryApi27 = sharedMemoryApi27Create;
            }
            if (sharedMemoryApi27Create != null) {
                sharedMemoryApi27Create.writeToBundle(bundle);
                return bundle;
            }
        }
        SplitArrayRetriever splitArrayRetriever = this.splitArrayRetriever;
        if (splitArrayRetriever == null) {
            SplitArrayRetriever splitArrayRetriever2 = new SplitArrayRetriever(this.byteArray);
            this.splitArrayRetriever = splitArrayRetriever2;
            splitArrayRetriever = splitArrayRetriever2;
        }
        splitArrayRetriever.writeToBundle(bundle);
        return bundle;
    }
}
