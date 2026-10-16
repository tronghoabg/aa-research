package io.flutter.view;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes5.dex */
public enum e {
    TAP(1),
    LONG_PRESS(2),
    SCROLL_LEFT(4),
    SCROLL_RIGHT(8),
    SCROLL_UP(16),
    SCROLL_DOWN(32),
    INCREASE(64),
    DECREASE(128),
    SHOW_ON_SCREEN(256),
    MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
    MOVE_CURSOR_BACKWARD_BY_CHARACTER(Segment.SHARE_MINIMUM),
    SET_SELECTION(2048),
    COPY(4096),
    CUT(Segment.SIZE),
    PASTE(Http2.INITIAL_MAX_FRAME_SIZE),
    DID_GAIN_ACCESSIBILITY_FOCUS(32768),
    DID_LOSE_ACCESSIBILITY_FOCUS(65536),
    CUSTOM_ACTION(131072),
    DISMISS(262144),
    MOVE_CURSOR_FORWARD_BY_WORD(524288),
    MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
    SET_TEXT(2097152),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS(4194304),
    /* JADX INFO: Fake field, exist only in values array */
    SCROLL_TO_OFFSET(8388608);


    /* renamed from: a, reason: collision with root package name */
    public final int f37217a;

    e(int i5) {
        this.f37217a = i5;
    }
}
