package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface TreeNode {
    JsonToken asToken();

    JsonParser.NumberType numberType();
}
