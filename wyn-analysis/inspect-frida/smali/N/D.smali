.class public final LN/D;
.super LN/f0;
.source "SourceFile"


# instance fields
.field public final b:LN/A0;


# direct methods
.method public constructor <init>(LN/A0;Ltf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LN/f0;-><init>(Ltf/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/D;->b:LN/A0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LN/g0;
    .locals 6

    .line 1
    new-instance v0, LN/g0;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    move v3, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const/4 v5, 0x1

    .line 11
    iget-object v4, p0, LN/D;->b:LN/A0;

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v5}, LN/g0;-><init>(LN/f0;Ljava/lang/Object;ZLN/A0;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
