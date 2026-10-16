.class public final Leb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/g;


# instance fields
.field public a:Luc/h;


# direct methods
.method public constructor <init>(Luc/f;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Luc/j;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LWa/d;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-direct {p1, p0, p2}, LWa/d;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Luc/j;->a(Luc/i;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Leb/d;->a:Luc/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Leb/d;->a:Luc/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Luc/h;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
