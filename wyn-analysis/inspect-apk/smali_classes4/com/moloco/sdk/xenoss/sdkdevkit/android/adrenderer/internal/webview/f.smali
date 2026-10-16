.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ltf/p;


# direct methods
.method public synthetic constructor <init>(JLtf/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;->a:J

    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;->b:Ltf/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Landroid/webkit/WebView;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    check-cast v4, LHf/c0;

    .line 22
    .line 23
    move-object/from16 v6, p5

    .line 24
    .line 25
    check-cast v6, Ltf/l;

    .line 26
    .line 27
    move-object/from16 v7, p6

    .line 28
    .line 29
    check-cast v7, Ltf/a;

    .line 30
    .line 31
    move-object/from16 v8, p7

    .line 32
    .line 33
    check-cast v8, Ltf/a;

    .line 34
    .line 35
    move-object/from16 v12, p8

    .line 36
    .line 37
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 38
    .line 39
    move-object/from16 v13, p9

    .line 40
    .line 41
    check-cast v13, LL0/d;

    .line 42
    .line 43
    move-object/from16 v2, p10

    .line 44
    .line 45
    check-cast v2, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    const-string v2, "webView"

    .line 52
    .line 53
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "canClose"

    .line 57
    .line 58
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v2, "onButtonRendered"

    .line 62
    .line 63
    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v2, "onCloseOrSkipButtonShown"

    .line 67
    .line 68
    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lu0/L;

    .line 72
    .line 73
    invoke-direct {v2, v1}, Lu0/L;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    const v1, 0x7f0a01bd

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 80
    .line 81
    .line 82
    move-object v1, v2

    .line 83
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;

    .line 84
    .line 85
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;->b:Ltf/p;

    .line 86
    .line 87
    iget-wide v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;->a:J

    .line 88
    .line 89
    const/4 v15, 0x1

    .line 90
    invoke-direct/range {v2 .. v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;-><init>(Landroid/webkit/WebView;LHf/c0;ILtf/l;Ltf/a;Ltf/a;JLtf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LL0/d;ZI)V

    .line 91
    .line 92
    .line 93
    new-instance v3, LV/d;

    .line 94
    .line 95
    const v4, 0x20feb9bd

    .line 96
    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    invoke-direct {v3, v4, v5, v2}, LV/d;-><init>(IZLef/e;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v3}, Lu0/L;->setContent(Ltf/p;)V

    .line 103
    .line 104
    .line 105
    return-object v1
.end method
