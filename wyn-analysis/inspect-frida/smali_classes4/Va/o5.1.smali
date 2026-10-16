.class public final LVa/o5;
.super Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static b:I


# instance fields
.field public final a:Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;


# direct methods
.method public constructor <init>(Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/o5;->a:Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/o5;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    rem-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LVa/o5;->a:Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;

    .line 12
    .line 13
    const/16 v2, 0x2b

    .line 14
    .line 15
    div-int/lit8 v2, v2, 0x0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LVa/o5;->a:Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v1, v1, 0x65

    .line 21
    .line 22
    rem-int/lit16 v1, v1, 0x80

    .line 23
    .line 24
    sput v1, LVa/o5;->b:I

    .line 25
    .line 26
    return-object v0
.end method
