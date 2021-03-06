package io.github.fukkitmc.fukkit.extras;

public interface ChunkTicketManagerExtra {

    <T> boolean removeTicketAtLevel(net.minecraft.server.world.ChunkTicketType var0, net.minecraft.util.math.ChunkPos var1, int var2, java.lang.Object var3);

    boolean removeTicket(long var0, net.minecraft.server.world.ChunkTicket var1);

    <T> void removeAllTicketsFor(net.minecraft.server.world.ChunkTicketType var0, int var1, java.lang.Object var2);

    <T> boolean addTicketAtLevel(net.minecraft.server.world.ChunkTicketType var0, net.minecraft.util.math.ChunkPos var1, int var2, java.lang.Object var3);

    boolean addTicket(long var0, net.minecraft.server.world.ChunkTicket var1);
}
