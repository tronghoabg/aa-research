.class public final Lu0/x;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Lu0/n;

.field public final synthetic j:Lu0/D;

.field public final synthetic k:LV/d;


# direct methods
.method public constructor <init>(Lu0/n;Lu0/D;LV/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/x;->i:Lu0/n;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/x;->j:Lu0/D;

    .line 4
    .line 5
    iput-object p3, p0, Lu0/x;->k:LV/d;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LN/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 p2, p2, 0xb

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-ne p2, v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LN/o;->x()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    iget-object p2, p0, Lu0/x;->i:Lu0/n;

    .line 26
    .line 27
    iget-object v0, p0, Lu0/x;->j:Lu0/D;

    .line 28
    .line 29
    iget-object v1, p0, Lu0/x;->k:LV/d;

    .line 30
    .line 31
    const/16 v2, 0x48

    .line 32
    .line 33
    invoke-static {p2, v0, v1, p1, v2}, Lu0/M;->a(Lt0/I;Lu0/D;LV/d;LN/o;I)V

    .line 34
    .line 35
    .line 36
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 37
    .line 38
    return-object p1
.end method
