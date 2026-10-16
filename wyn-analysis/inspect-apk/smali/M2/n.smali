.class public final LM2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LM2/s;

.field public final b:LM2/v;

.field public final c:Ls2/C;

.field public final d:LJ5/x;

.field public e:I


# direct methods
.method public constructor <init>(LM2/s;LM2/v;Ls2/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/n;->a:LM2/s;

    .line 5
    .line 6
    iput-object p2, p0, LM2/n;->b:LM2/v;

    .line 7
    .line 8
    iput-object p3, p0, LM2/n;->c:Ls2/C;

    .line 9
    .line 10
    iget-object p1, p1, LM2/s;->g:LN1/n;

    .line 11
    .line 12
    iget-object p1, p1, LN1/n;->n:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, LJ5/x;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-direct {p1, p2}, LJ5/x;-><init>(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    iput-object p1, p0, LM2/n;->d:LJ5/x;

    .line 31
    .line 32
    return-void
.end method
