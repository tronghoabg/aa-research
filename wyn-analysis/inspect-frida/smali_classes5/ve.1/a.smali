.class public final Lve/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lve/a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lve/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 p2, 0xc8

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    if-gt p2, p1, :cond_0

    .line 13
    .line 14
    const/16 p2, 0x12c

    .line 15
    .line 16
    if-ge p1, p2, :cond_0

    .line 17
    .line 18
    move p2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v1

    .line 21
    :goto_0
    iput-boolean p2, p0, Lve/a;->c:Z

    .line 22
    .line 23
    const/16 p2, 0x1f4

    .line 24
    .line 25
    if-gt p2, p1, :cond_1

    .line 26
    .line 27
    const/16 p2, 0x258

    .line 28
    .line 29
    if-ge p1, p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v1

    .line 33
    :goto_1
    iput-boolean v0, p0, Lve/a;->d:Z

    .line 34
    .line 35
    return-void
.end method
