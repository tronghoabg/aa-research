.class public final Le/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:Ltf/a;


# direct methods
.method public constructor <init>(ZLtf/a;I)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Le/a;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Le/a;->j:Ltf/a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

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
    iget-boolean p2, p0, Le/a;->i:Z

    .line 9
    .line 10
    iget-object v0, p0, Le/a;->j:Ltf/a;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p2, v0, p1, v1}, Lvf/a;->a(ZLtf/a;LN/o;I)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    return-object p1
.end method
