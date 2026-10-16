package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class JointType {
    public static final int BEVEL = 1;
    public static final int DEFAULT = 0;
    public static final int ROUND = 2;
    public static final java.lang.String UNRECOGNIZED_JOINT_TYPE_ERROR_MESSAGE_TEMPLATE = "Unrecognized JointType value [%s] in %s, drawing DEFAULT JointType instead.";

    private JointType() {
    }

    public static boolean isRecognizedJointType(int i) {
        return i == 0 || i == 1 || i == 2;
    }
}
