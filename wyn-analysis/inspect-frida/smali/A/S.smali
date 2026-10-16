.class public final LA/S;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LA/U;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(LA/U;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, LA/S;->i:I

    iput-object p1, p0, LA/S;->j:LA/U;

    iput-object p2, p0, LA/S;->k:Ljava/lang/Object;

    iput p3, p0, LA/S;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LA/S;->i:I

    .line 2
    .line 3
    check-cast p1, LN/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, LA/S;->l:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    iget-object v0, p0, LA/S;->j:LA/U;

    .line 18
    .line 19
    iget-object v1, p0, LA/S;->k:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1, p2}, LA/U;->g(Ljava/lang/Object;LN/o;I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget p2, p0, LA/S;->l:I

    .line 28
    .line 29
    or-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    iget-object v0, p0, LA/S;->j:LA/U;

    .line 32
    .line 33
    iget-object v1, p0, LA/S;->k:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1, p2}, LA/U;->a(Ljava/lang/Object;LN/o;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lef/C;->a:Lef/C;

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
