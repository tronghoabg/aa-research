.class public final LM0/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Ltf/l;

.field public final synthetic j:LZ/k;

.field public final synthetic k:LM0/m;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Ltf/l;LZ/k;LM0/m;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LM0/l;->i:Ltf/l;

    .line 2
    .line 3
    iput-object p2, p0, LM0/l;->j:LZ/k;

    .line 4
    .line 5
    iput-object p3, p0, LM0/l;->k:LM0/m;

    .line 6
    .line 7
    iput p4, p0, LM0/l;->l:I

    .line 8
    .line 9
    iput p5, p0, LM0/l;->m:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LM0/l;->l:I

    .line 10
    .line 11
    or-int/lit8 v4, p1, 0x1

    .line 12
    .line 13
    iget-object v0, p0, LM0/l;->i:Ltf/l;

    .line 14
    .line 15
    iget v5, p0, LM0/l;->m:I

    .line 16
    .line 17
    iget-object v1, p0, LM0/l;->j:LZ/k;

    .line 18
    .line 19
    iget-object v2, p0, LM0/l;->k:LM0/m;

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, La/a;->c(Ltf/l;LZ/k;LM0/m;LN/o;II)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    return-object p1
.end method
