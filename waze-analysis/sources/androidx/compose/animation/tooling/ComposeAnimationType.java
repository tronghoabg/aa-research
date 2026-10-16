package androidx.compose.animation.tooling;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposeAnimationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ComposeAnimationType[] $VALUES;
    public static final ComposeAnimationType TRANSITION_ANIMATION = new ComposeAnimationType("TRANSITION_ANIMATION", 0);
    public static final ComposeAnimationType ANIMATED_VALUE = new ComposeAnimationType("ANIMATED_VALUE", 1);
    public static final ComposeAnimationType ANIMATED_VISIBILITY = new ComposeAnimationType("ANIMATED_VISIBILITY", 2);
    public static final ComposeAnimationType ANIMATABLE = new ComposeAnimationType("ANIMATABLE", 3);
    public static final ComposeAnimationType ANIMATE_CONTENT_SIZE = new ComposeAnimationType("ANIMATE_CONTENT_SIZE", 4);
    public static final ComposeAnimationType ANIMATE_X_AS_STATE = new ComposeAnimationType("ANIMATE_X_AS_STATE", 5);
    public static final ComposeAnimationType ANIMATED_CONTENT = new ComposeAnimationType("ANIMATED_CONTENT", 6);
    public static final ComposeAnimationType DECAY_ANIMATION = new ComposeAnimationType("DECAY_ANIMATION", 7);
    public static final ComposeAnimationType INFINITE_TRANSITION = new ComposeAnimationType("INFINITE_TRANSITION", 8);
    public static final ComposeAnimationType TARGET_BASED_ANIMATION = new ComposeAnimationType("TARGET_BASED_ANIMATION", 9);
    public static final ComposeAnimationType UNSUPPORTED = new ComposeAnimationType("UNSUPPORTED", 10);

    private static final /* synthetic */ ComposeAnimationType[] $values() {
        return new ComposeAnimationType[]{TRANSITION_ANIMATION, ANIMATED_VALUE, ANIMATED_VISIBILITY, ANIMATABLE, ANIMATE_CONTENT_SIZE, ANIMATE_X_AS_STATE, ANIMATED_CONTENT, DECAY_ANIMATION, INFINITE_TRANSITION, TARGET_BASED_ANIMATION, UNSUPPORTED};
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArr$values = $values();
        $VALUES = composeAnimationTypeArr$values;
        $ENTRIES = b.a(composeAnimationTypeArr$values);
    }

    private ComposeAnimationType(String str, int i2) {
    }

    public static a<ComposeAnimationType> getEntries() {
        return $ENTRIES;
    }

    public static ComposeAnimationType valueOf(String str) {
        return (ComposeAnimationType) Enum.valueOf(ComposeAnimationType.class, str);
    }

    public static ComposeAnimationType[] values() {
        return (ComposeAnimationType[]) $VALUES.clone();
    }
}
