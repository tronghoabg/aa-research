package androidx.webkit.internal;

import androidx.webkit.StartUpLocation;
import androidx.webkit.WebViewStartUpResult;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebViewStartupResultImpl implements WebViewStartUpResult, BiConsumer<Integer, Object> {
    private Long mMaxTimePerTaskUiThreadMillis;
    private Long mTotalTimeUiThreadMillis;
    private List<StartUpLocation> mBlockingStartupLocations = new ArrayList();
    private List<StartUpLocation> mAsyncStartupLocations = new ArrayList();

    /* compiled from: WazeSource */
    class StartUpLocationImpl implements StartUpLocation {
        private final Throwable mThrowable;

        StartUpLocationImpl(Throwable th) {
            this.mThrowable = th;
        }

        @Override // androidx.webkit.StartUpLocation
        public Throwable getStackInformation() {
            return this.mThrowable;
        }
    }

    public WebViewStartupResultImpl(Consumer<BiConsumer<Integer, Object>> consumer) {
        consumer.accept(this);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            if (obj != null) {
                this.mTotalTimeUiThreadMillis = (Long) obj;
                return;
            }
            return;
        }
        if (iIntValue == 1) {
            if (obj != null) {
                this.mMaxTimePerTaskUiThreadMillis = (Long) obj;
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            this.mBlockingStartupLocations.add(new StartUpLocationImpl((Throwable) obj));
            return;
        }
        if (iIntValue != 3) {
            if (num.intValue() >= 0) {
                return;
            }
            Objects.toString(num);
            throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: ".concat(String.valueOf(num)));
        }
        if (!(obj instanceof List)) {
            this.mAsyncStartupLocations.add(new StartUpLocationImpl((Throwable) obj));
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        this.mAsyncStartupLocations.add(new StartUpLocationImpl((Throwable) list.get(0)));
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return this.mMaxTimePerTaskUiThreadMillis;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List<StartUpLocation> getNonUiThreadBlockingStartUpLocations() {
        return this.mAsyncStartupLocations;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getTotalTimeInUiThreadMillis() {
        return this.mTotalTimeUiThreadMillis;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List<StartUpLocation> getUiThreadBlockingStartUpLocations() {
        return this.mBlockingStartupLocations;
    }
}
