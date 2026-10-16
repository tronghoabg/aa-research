package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    public static final int $stable = 8;
    private String currentContent;
    private String debugName;
    private MutableState<Long> updateFlag;
    private int forcedWidth = Integer.MIN_VALUE;
    private int forcedHeight = Integer.MIN_VALUE;
    private MotionLayoutDebugFlags forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
    private LayoutInfoFlags layoutInformationMode = LayoutInfoFlags.NONE;
    private String layoutInformation = "";
    private long last = System.nanoTime();

    public EditableJSONLayout(String str) {
        this.currentContent = str;
    }

    public final String getCurrentContent() {
        return this.currentContent;
    }

    public final String getDebugName() {
        return this.debugName;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    protected final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentLayoutInformation() {
                        return this.this$0.layoutInformation;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentMotionScene() {
                        return this.this$0.currentContent;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        return this.this$0.last;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int i2, int i3) {
                        this.this$0.onNewDimensions(i2, i3);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(String str) {
                        if (str == null) {
                            return;
                        }
                        this.this$0.onNewContent(str);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float f2) {
                        this.this$0.onNewProgress(f2);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int i2) {
                        this.this$0.onDrawDebug(i2);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int i2) {
                        this.this$0.onLayoutInformation(i2);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    protected final void onDrawDebug(int i2) {
        this.forcedDrawDebug = i2 == MotionLayoutDebugFlags.UNKNOWN.ordinal() ? MotionLayoutDebugFlags.UNKNOWN : i2 == MotionLayoutDebugFlags.NONE.ordinal() ? MotionLayoutDebugFlags.NONE : i2 == MotionLayoutDebugFlags.SHOW_ALL.ordinal() ? MotionLayoutDebugFlags.SHOW_ALL : MotionLayoutDebugFlags.UNKNOWN;
        signalUpdate();
    }

    protected final void onLayoutInformation(int i2) {
        if (i2 == LayoutInfoFlags.NONE.ordinal()) {
            this.layoutInformationMode = LayoutInfoFlags.NONE;
        } else if (i2 == LayoutInfoFlags.BOUNDS.ordinal()) {
            this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
        }
        signalUpdate();
    }

    protected void onNewContent(String str) {
        this.currentContent = str;
        try {
            CLObject cLObject = CLParser.parse(str);
            if (this.debugName != null) {
                signalUpdate();
                return;
            }
            CLObject objectOrNull = cLObject.getObjectOrNull("Header");
            if (objectOrNull != null) {
                this.debugName = objectOrNull.getStringOrNull("exportAs");
                this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int i2, int i3) {
        this.forcedWidth = i2;
        this.forcedHeight = i3;
        signalUpdate();
    }

    public final void setCurrentContent(String str) {
        onNewContent(str);
    }

    public final void setDebugName(String str) {
        this.debugName = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(String str) {
        this.last = System.nanoTime();
        this.layoutInformation = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setUpdateFlag(MutableState<Long> mutableState) {
        this.updateFlag = mutableState;
    }

    protected final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            mutableState.setValue(Long.valueOf(mutableState.getValue().longValue() + 1));
        }
    }
}
