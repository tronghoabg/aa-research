.class public final LF5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LF5/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LF5/l;

    .line 8
    .line 9
    invoke-direct {v0}, LF5/l;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget v0, LF5/k;->b:I

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LF5/l;-><init>(LF5/k;)V

    .line 2
    sget v0, Lu6/v;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    return-void
.end method

.method public constructor <init>(LF5/k;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LF5/l;->a:LF5/k;

    return-void
.end method

.method public constructor <init>(Landroid/media/metrics/LogSessionId;)V
    .locals 1

    .line 3
    new-instance v0, LF5/k;

    invoke-direct {v0, p1}, LF5/k;-><init>(Landroid/media/metrics/LogSessionId;)V

    invoke-direct {p0, v0}, LF5/l;-><init>(LF5/k;)V

    return-void
.end method
