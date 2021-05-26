package com.harsha.torrenti.items

import java.util.*



/**
 * Created by Harsha on 18/04/2021.
 */
class ItemTorrent {
    internal var title = ArrayList<String>()
    internal var description = ArrayList<String>()
    internal var sid = ArrayList<String>()
    internal var lich = ArrayList<String>()
    internal var source = ArrayList<String>()
    internal var type = ArrayList<String>()
    internal var size = ArrayList<String>()
    internal var link = ArrayList<String>()
    internal var linkMagnet = ArrayList<String>()
    internal var linkTorrent = ArrayList<String>()

    fun addItems(items: ItemTorrent) {
        this.title.addAll(items.title)
        this.description.addAll(items.description)
        this.title.addAll(items.title)
        this.sid.addAll(items.sid)
        this.lich.addAll(items.lich)
        this.source.addAll(items.source)
        this.type.addAll(items.type)
        this.link.addAll(items.link)
        this.link.addAll(items.link)
        this.linkMagnet.addAll(items.linkMagnet)
        this.linkTorrent.addAll(items.linkTorrent)
    }
}