package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import h.g.a.a;
import h.g.b.x;
import h.n.o;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SharedCounter {
    public static final Factory Factory = Factory.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Factory {
        static final /* synthetic */ Factory $$INSTANCE = new Factory();
        private static final NativeSharedCounter nativeSharedCounter;

        static {
            System.loadLibrary("datastore_shared_counter");
            nativeSharedCounter = new NativeSharedCounter();
        }

        private Factory() {
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            NativeSharedCounter nativeSharedCounter2 = nativeSharedCounter;
            if (nativeSharedCounter2 == null) {
                throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
            }
            int fd = parcelFileDescriptor.getFd();
            if (nativeSharedCounter2.nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = nativeSharedCounter2.nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new RealSharedCounter(nativeSharedCounter2, jNativeCreateSharedCounter);
            }
            throw new IOException("Failed to mmap counter file");
        }

        private final boolean isDalvik() {
            return o.m("dalvik", System.getProperty("java.vm.name"), true);
        }

        public final SharedCounter create$datastore_core(a<? extends File> aVar) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            x.f(aVar, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(aVar.invoke(), 939524096);
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptorOpen = null;
            }
            try {
                x.c(parcelFileDescriptorOpen);
                SharedCounter sharedCounterCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                return sharedCounterCreateCounterFromFd;
            } catch (Throwable th2) {
                th = th2;
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    final class RealSharedCounter implements SharedCounter {
        private final long mappedAddress;
        private final NativeSharedCounter nativeSharedCounter;

        public RealSharedCounter(NativeSharedCounter nativeSharedCounter, long j2) {
            x.f(nativeSharedCounter, "nativeSharedCounter");
            this.nativeSharedCounter = nativeSharedCounter;
            this.mappedAddress = j2;
        }

        @Override // androidx.datastore.core.SharedCounter
        public int getValue() {
            return this.nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
        }

        @Override // androidx.datastore.core.SharedCounter
        public int incrementAndGetValue() {
            return this.nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
        }
    }

    /* compiled from: WazeSource */
    final class ShadowSharedCounter implements SharedCounter {
        private final AtomicInteger value = new AtomicInteger(0);

        @Override // androidx.datastore.core.SharedCounter
        public int getValue() {
            return this.value.get();
        }

        @Override // androidx.datastore.core.SharedCounter
        public int incrementAndGetValue() {
            return this.value.incrementAndGet();
        }
    }

    int getValue();

    int incrementAndGetValue();
}
