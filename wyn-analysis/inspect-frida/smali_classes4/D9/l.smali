.class public final LD9/l;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# instance fields
.field public final synthetic a:LD9/m;


# direct methods
.method public constructor <init>(JLD9/m;)V
    .locals 2

    .line 1
    iput-object p3, p0, LD9/l;->a:LD9/m;

    .line 2
    .line 3
    const-wide/16 v0, 0x3e8

    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, LD9/l;->a:LD9/m;

    .line 2
    .line 3
    invoke-interface {v0}, LD9/m;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onTick(J)V
    .locals 0

    .line 1
    return-void
.end method
